package behavioural.chainOfResponsibility.concept;

/**
 * Created by jackfrancisdalton on 12/04/17.
 */
public class HandlerA extends AbstractHandler {

    public HandlerA() {}

    @Override
    void print(Request request) {
        System.out.println("A:" + request.getWord());
    }

    @Override
    String getProcessCode() {
        return "A";
    }
}
