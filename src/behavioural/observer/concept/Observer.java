package behavioural.observer.concept;

/**
 * Created by jackfrancisdalton on 13/04/17.
 */
public class Observer {
    private Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.print(" " + Integer.toHexString(subject.getState()));
    }
}
