package behavioural.nullobject.concept;

/**
 * Created by jackfrancisdalton on 08/04/17.
 */
public class ImpObject extends AbstractObject {

    public ImpObject(int id) {
        super(id);
    }

    @Override
    public void execute() {
        System.out.println("Printed object with the id:" + getId());
    }
}
