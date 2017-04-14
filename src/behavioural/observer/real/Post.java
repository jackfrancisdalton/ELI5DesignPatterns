package behavioural.observer.real;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackfrancisdalton on 14/04/17.
 */
public class Post {
    private User poster;
    private List<User> followingUsers;
    private String content;

    public Post(User poster,String content) {
        this.poster = poster;
        this.content = content;
        this.followingUsers = new ArrayList<>();
    }

    public void follow(User user) {
        followingUsers.add(user);
    }

    public void unfollow(User user) {
        followingUsers.remove(user);
    }

    public User getPoster() {
        return poster;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.sendNotification(generateEditNotification());
    }

    public void sendNotification(String message) {
        for (User u: followingUsers) {
            u.notify(message);
        }
    }

    private String generateEditNotification() {
        return poster.getUsername() + "'s post was edited";
    }
}
