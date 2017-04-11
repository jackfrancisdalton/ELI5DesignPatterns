package behavioural.memento.concept;

/**
 * Created by jackfrancisdalton on 10/04/17.
 */
public class Main {

    public static void main(String[] args) {
        Originator o1 = new Originator(10, "Hello");
        CareTaker.addMemento(o1.saveStateToMemento());

        o1.setNumber(20);
        o1.setWord("World");

        o1.getStateFromMemento(CareTaker.getMemento(0));

        System.out.println(o1.getNumber());
        System.out.println(o1.getWord());
    }
}
