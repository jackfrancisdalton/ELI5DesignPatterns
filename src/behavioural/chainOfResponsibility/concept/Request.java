package behavioural.chainOfResponsibility.concept;

/**
 * Created by jackfrancisdalton on 12/04/17.
 */
public class Request {
    private String word;
    private String processType;

    public Request(String word, String processType) {
        this.word = word;
        this.processType = processType;
    }

    public String getWord() {
        return word;
    }

    public String getProcessType() {
        return processType;
    }
}
