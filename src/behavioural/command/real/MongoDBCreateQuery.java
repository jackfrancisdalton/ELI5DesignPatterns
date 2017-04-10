package behavioural.command.real;

/**
 * Created by jackfrancisdalton on 07/04/17.
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
