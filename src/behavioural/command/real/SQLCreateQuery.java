package behavioural.command.real;

/**
 * Command implementation
 */
public class SQLCreateQuery implements QueryCommand{
    private Entity entity;

    public SQLCreateQuery(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void execute() {
        System.out.println(
                "INSERT INTO " + entity.getClass().getSimpleName() + " (ID)\n" +
                "VALUES (\"" + entity.getId() + "\");"
        );
    }
}
