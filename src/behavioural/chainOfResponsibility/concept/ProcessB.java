package behavioural.chainOfResponsibility.concept;

/**
 * Created by jackfrancisdalton on 12/04/17.
 */
public class ProcessB extends Process {

    public ProcessB() {}

    @Override
    void printWord(Request request) {
        System.out.println("B:" + request.getWord());
    }

    @Override
    String getProcessCode() {
        return "B";
    }
}
