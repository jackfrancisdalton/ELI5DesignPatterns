package behavioural.command.concept;


public class Main {
    public static void main(String[] args) {
        Item hello= new Item("Hello");
        Item world = new Item("Word");

        Commander commander = new Commander();
        commander.addCommand(new CommandImpA(hello));
        commander.addCommand(new CommandImpB(world));
        commander.executeCommands();
    }
}
