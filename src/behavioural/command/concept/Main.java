package behavioural.command.concept;


public class Main {
    public static void main(String[] args) {

        //Create items
        Item hello = new Item("Hello");
        Item world = new Item("Word");

        //Wrap items in commands
        ICommand commandA = new CommandImpA(hello);
        ICommand commandB = new CommandImpB(world);

        //create invoker and add commands to invoker list
        Invoker commander = new Invoker();
        commander.addCommand(new CommandImpA(hello));
        commander.addCommand(new CommandImpB(world));

        //execute all command inside the invokers list
        commander.executeCommands();
    }
}
