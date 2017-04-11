package behavioural.memento.real;

import java.util.ArrayList;
import java.util.List;

public class UndoRedoHandler {
    private  List<Memento> mementoList = new ArrayList<>();
    private  int currentIndex = 0;

    public UndoRedoHandler() {}

    public void addMemento(Memento memento) {
        mementoList.add(memento);
        currentIndex++;
    }

    public Memento undo() {
        decrementIndex();
        return  mementoList.get(currentIndex);
    }

    public Memento redo() {
        incrementIndex();
        return  mementoList.get(currentIndex);
    }

    public Memento getMemento(int idx) {
        currentIndex = idx;
        return mementoList.get(idx);
    }

    private void decrementIndex() {
        if(currentIndex > 0) {
            currentIndex -= 1;
        }
    }

    private void incrementIndex() {
        if(currentIndex < mementoList.size() - 1) {
            currentIndex += 1;
        }
    }
}
