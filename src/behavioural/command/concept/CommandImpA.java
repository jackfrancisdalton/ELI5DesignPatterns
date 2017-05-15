package behavioural.command.concept;

public class CommandImpA implements ICommand {
    private Receiver receiver;

    public CommandImpA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("A:" + receiver);
    }
}
