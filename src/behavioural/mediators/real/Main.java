package behavioural.mediators.real;

/**
 * Created by jackfrancisdalton on 09/04/17.
 */
public class Main {

    public static void main(String[] args) {
        User jack = new User("Jack Dalton");
        User theo = new User("Theo Barfoot");

        User jane = new User("Jane Austin");
        User sally = new User("Sally Crumps");

        ChatRoom boysRoom = new ChatRoom("Boys Chat Room");
        boysRoom.addMemeber(jack);
        boysRoom.addMemeber(theo);

        ChatRoom girlsRoom = new ChatRoom("Girls Chat Room");
        girlsRoom.addMemeber(jane);
        girlsRoom.addMemeber(sally);

        System.out.println("\n ------------- \n ");

        jack.sendMessage(boysRoom, "Hi man, how is it going?");
        theo.sendMessage(boysRoom, "Really good thanks.");
        theo.sendMessage(boysRoom, "You up to much later man?");
        jack.sendMessage(boysRoom, "Nah.");
        jane.sendMessage(boysRoom, "Hey can I join?");
        boysRoom.addMemeber(jane);
        jane.sendMessage(boysRoom, "Wahhooo I'm in!");

        System.out.println("\n ------------- \n ");

        jane.sendMessage(girlsRoom, "Hey girl, what is up?");
        jane.sendMessage(girlsRoom, "Not much.");

        System.out.println("\n ------------- \n ");

        System.out.print("Search results for \"man\"");
        for (Message m: boysRoom.searchMessages("man")) {
            System.out.println("User:" + m.getPoster().getUsername() + " Message:" + m.getContent());
        }
    }
}
