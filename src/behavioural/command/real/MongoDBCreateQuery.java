package behavioural.command.real;

/**
 * Command implementation
 */
public class MongoDBCreateQuery implements QueryCommand {
    private Entity entity;

    public MongoDBCreateQuery(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void execute() {
        System.out.println("db." + entity.getClass().getSimpleName() + ".insert(id:\"" + entity.getId() + "\")");
    }
}
