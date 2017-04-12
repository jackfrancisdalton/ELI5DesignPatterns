package behavioural.chainOfResponsibility.concept;

/**
 * Created by jackfrancisdalton on 12/04/17.
 */
public class ProcessC extends Process {

    public ProcessC() {}

    @Override
    void printWord(Request request) {
        System.out.println("C:" + request.getWord());
    }

    @Override
    String getProcessCode() {
        return "C";
    }
}
