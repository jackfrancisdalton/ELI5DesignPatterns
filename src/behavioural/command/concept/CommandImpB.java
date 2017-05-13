package behavioural.command.concept;

public class CommandImpB extends Command{

    public CommandImpB(Item item) {
        super(item);
    }

    @Override
    public void execute() {
        System.out.println("Comment B prints:" + item.toString());
    }
}
