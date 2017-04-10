package behavioural.mediators.concept;

/**
 * Created by jackfrancisdalton on 09/04/17.
 */
public class Main {

    public static void main(String[] args) {
        Item i1 = new Item("Hello");
        Item i2 = new Item("World");
        i1.execute();
        i2.execute();
    }
}
