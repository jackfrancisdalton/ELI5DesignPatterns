package behavioural.command.concept;

/**
 * (also known as Receiver)
 * Item contains all of the properties and methods for desired processing.
 * Everything outside of this class is pattern to handle the execution...
 * ...of methods in this class
*/
public class Item {
    private String value;

    public Item(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
