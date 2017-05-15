package behavioural.command.concept;

/**
 * (also known as Receiver)
 * Receiver contains all of the properties and methods for desired processing.
 * Everything outside of this class is pattern to handle the execution...
 * ...of methods in this class
*/
public class Receiver {
    private String value;

    public Receiver(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
