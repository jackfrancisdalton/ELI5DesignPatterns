package behavioural.observer.real;

/**
 * Created by jackfrancisdalton on 14/04/17.
 */
public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Post createPost(String content) {
        return new Post(this, content);
    }

    public void notify(String message) {
        System.out.println(username + " : " + message);
    }
}
