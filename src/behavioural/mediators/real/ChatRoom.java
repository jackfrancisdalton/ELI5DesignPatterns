package behavioural.mediators.real;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackfrancisdalton on 09/04/17.
 */
public class ChatRoom {
    private String name;
    private List<User> members;
    private List<Message> messages;

    public ChatRoom(String name) {
        this.name = name;
        this.messages = new ArrayList<>();
        this.members =  new ArrayList<>();
    }

    public void sendMessage(Message message) {
        if(members.contains(message.getPoster())) {
            messages.add(message);
            System.out.println(name + " : " + message.getPoster().getUsername() + " : " + message.getContent());
        } else {
            System.out.println("[invalid user tried to post]");
        }
    }


    public void addMemeber(User user) {
        members.add(user);
        System.out.println("[" + user.getUsername() + " joined the " + getName() + "]");
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Message getLatestMessage() {
        return messages.get(messages.size());
    };

    public List<Message> searchMessages(String query) {
        List<Message> releventMessages = new ArrayList<>();

        for (int i = 0; i < messages.size(); i++) {
            if(messages.get(i).getContent().contains(query)) {
                releventMessages.add(messages.get(i));
            }
        }

        return releventMessages;
    }
}
