package behavioural.memento.concept;


import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private static List<Memento> mementos = new ArrayList<>();

    public static void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public static Memento getMemento(int i) {
        return mementos.get(i);
    }
}
