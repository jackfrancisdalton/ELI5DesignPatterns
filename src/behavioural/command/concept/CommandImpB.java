package behavioural.command.concept;

/**
 * Created by jackfrancisdalton on 07/04/17.
 */
public class CommandImpB implements Command{
    private Item item;

    public CommandImpB(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        System.out.println("Comment B prints:" + item.toString());
    }
}
