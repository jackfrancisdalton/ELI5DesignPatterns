package behavioural.mediators.real;

/**
 * Created by jackfrancisdalton on 09/04/17.
 */
public class Message {
    private User poster;
    private String content;

    public Message(User poster, String content) {
        this.poster = poster;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public User getPoster() {
        return poster;
    }
}
