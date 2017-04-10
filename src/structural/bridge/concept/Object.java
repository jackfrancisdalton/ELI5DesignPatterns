package structural.bridge.concept;

/**
 * Created by jackfrancisdalton on 06/04/17.
 */
public class Object extends AbstractObject {

    public Object(FunctionalityInterface functionalityInterface) {
        super(functionalityInterface);
    }

    @Override
    public void display() {
        super.functionalityInterface.display();
    }
}
