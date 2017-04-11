package behavioural.memento.concept;

public class Memento {
    private int number;
    private String word;

    public Memento(int number, String word) {
        this.number = number;
        this.word = word;
    }

    public int getNumber() {
        return number;
    }

    public String getWord() {
        return word;
    }

    //No setter as a memento should be immutable
}
