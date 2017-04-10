package behavioural.command.real;

/**
 * Created by jackfrancisdalton on 07/04/17.
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
