package behavioural.chainOfResponsibility.concept;

/**
 * Created by jackfrancisdalton on 12/04/17.
 */
public class ProcessA extends Process {

    public ProcessA() {}

    @Override
    void printWord(Request request) {
        System.out.println("A:" + request.getWord());
    }

    @Override
    String getProcessCode() {
        return "A";
    }
}
