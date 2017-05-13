package behavioural.command.concept;

/**
 * The only required method for a command in this example is that it can execute
 * This interface will be used as an interface between invoker and ICommand implementations
 */
public interface ICommand {
    void execute();
}
