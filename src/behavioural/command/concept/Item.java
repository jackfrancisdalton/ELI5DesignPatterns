package behavioural.command.concept;


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
