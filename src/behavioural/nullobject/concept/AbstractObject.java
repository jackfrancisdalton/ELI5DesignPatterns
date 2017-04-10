package behavioural.nullobject.concept;

/**
 * Created by jackfrancisdalton on 08/04/17.
 */
public abstract class AbstractObject {
    protected int id;

    public AbstractObject(int id) {
        this.id = id;
    }

    public abstract void execute();

    public int getId() {
        return id;
    }
}
