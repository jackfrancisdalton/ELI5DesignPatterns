package behavioural.memento.concept;

/**
 * Created by jackfrancisdalton on 10/04/17.
 */
public class Originator {
    private int number;
    private String word;

    public Originator(int number, String word) {
        this.number = number;
        this.word = word;
    }

    public Memento saveStateToMemento(){
        return new Memento(number, word);
    }

    public void getStateFromMemento(Memento memento){
        this.word = memento.getWord();
        this.number = memento.getNumber();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
