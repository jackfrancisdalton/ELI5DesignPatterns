package behavioural.memento.real;

/**
 * Created by jackfrancisdalton on 11/04/17.
 */
public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void appendText(String text) {
        content += text;
    }

    public void loadFromMemento(Memento memento) {
        content = memento.getContent();
    }

    public Memento saveToMemento() {
        return new Memento(content);
    }

    public void print() {
        System.out.println(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
