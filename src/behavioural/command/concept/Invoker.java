package behavioural.command.concept;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker should be considered a command execution handler.
 * It defines the methods for executing commands
 * It can also have internal logic, in this example we are tracking the number of executed commands.
 */
public class Invoker {
    private int numberOfCommandsExecuted = 0;
    private List<ICommand> commands = new ArrayList<>();

    public Invoker() {}

    public void addCommand(ICommand command){
        commands.add(command);
    }

    public void removeCommand(ICommand command) {
        commands.remove(command);
    }

    public void executeCommands() {
        commands.forEach(c -> {c.execute(); numberOfCommandsExecuted++;});
        commands.removeAll(commands);
    }
}
