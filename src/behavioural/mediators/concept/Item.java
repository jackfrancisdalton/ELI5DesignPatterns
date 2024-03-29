package behavioural.mediators.concept;

public class Item {
    private String value;

    public Item(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void execute() {
        Mediator.sendValue(value);
    }
}
