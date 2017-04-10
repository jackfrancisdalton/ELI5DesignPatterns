package behavioural.command.concept;

/**
 * Created by jackfrancisdalton on 07/04/17.
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
