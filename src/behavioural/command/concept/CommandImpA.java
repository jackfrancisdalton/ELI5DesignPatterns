package behavioural.command.concept;

/**
 * Created by jackfrancisdalton on 07/04/17.
 */
public class CommandImpA implements Command{
    private Item item;

    public CommandImpA(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        System.out.println("command A prints:" + item);
    }
}
