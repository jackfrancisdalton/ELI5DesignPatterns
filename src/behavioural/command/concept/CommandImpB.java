package behavioural.command.concept;

public class CommandImpB implements ICommand {
    private Item item;

    public CommandImpB(Item item) {
        this.item = item;
    }


    @Override
    public void execute() {
        System.out.println("B:" + item.toString());
    }
}
