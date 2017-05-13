package behavioural.command.concept;

public abstract class Command {
    protected Item item;

    public Command(Item item) {
        this.item = item;
    }

    abstract void execute();
}
