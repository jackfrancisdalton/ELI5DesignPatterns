package behavioural.command.concept;

import java.util.ArrayList;
import java.util.List;

public class Commander {
    private List<Command> commands = new ArrayList<>();

    public Commander() {}

    public void addCommand(Command command){
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void executeCommands() {
        for (Command c: commands) {
            c.execute();
        }

        commands.removeAll(commands);
    }
}
