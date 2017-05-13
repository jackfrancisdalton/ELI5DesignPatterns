package behavioural.command.concept;

public class CommandImpA implements ICommand {
    private Item item;

    public CommandImpA(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        System.out.println("A:" + item);
    }
}
