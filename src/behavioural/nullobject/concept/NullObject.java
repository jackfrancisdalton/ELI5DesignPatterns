package behavioural.nullobject.concept;

/**
 * Created by jackfrancisdalton on 08/04/17.
 */
public class NullObject extends AbstractObject {

    public NullObject(int id) {
        super(id);
    }

    @Override
    public void execute() {
        System.out.println("Null object printed");
    }
}
