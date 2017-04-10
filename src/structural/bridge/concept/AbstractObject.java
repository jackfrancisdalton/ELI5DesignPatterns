package structural.bridge.concept;

/**
 * Abstract object used to interface with implementations
 */

public abstract class AbstractObject {
    protected FunctionalityInterface functionalityInterface;

    protected AbstractObject(final FunctionalityInterface functionalityInterface) {
        this.functionalityInterface = functionalityInterface;
    }

    public abstract void display();
}
