package behavioural.memento.real;

/**
 * Created by jackfrancisdalton on 11/04/17.
 */
public class Main {
    public static void main(String[] args) {
        UndoRedoHandler handler = new UndoRedoHandler();

        Document doc = new Document("Hello");
        handler.addMemento(doc.saveToMemento());

        doc.appendText(" World");
        handler.addMemento(doc.saveToMemento());

        doc.loadFromMemento(handler.undo());
        doc.print();

        doc.loadFromMemento(handler.undo());
        doc.print();

        doc.loadFromMemento(handler.redo());
        doc.print();
    }
}
