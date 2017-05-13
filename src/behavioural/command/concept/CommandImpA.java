package behavioural.command.concept;

/**
 * Created by jackfrancisdalton on 07/04/17.
 */
public class CommandImpA extends Command{

    public CommandImpA(Item item) {
        super(item);
    }

    @Override
    public void execute() {
        System.out.println("command A prints:" + item);
    }
}
