package behavioural.command.concept;

public class CommandImpB implements ICommand {
    private Receiver receiver;

    public CommandImpB(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        System.out.println("B:" + receiver.toString());
    }
}
