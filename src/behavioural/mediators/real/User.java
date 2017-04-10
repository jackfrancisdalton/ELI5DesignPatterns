package behavioural.mediators.real;

/**
 * Created by jackfrancisdalton on 09/04/17.
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

    public void sendMessage(ChatRoom cr, String message) {
        cr.sendMessage(new Message(this, message));
    }
}
