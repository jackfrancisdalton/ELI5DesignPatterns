package behavioural.chainOfResponsibility.concept;

/**
 * Created by jackfrancisdalton on 12/04/17.
 */
public class HandlerB extends AbstractHandler {

    public HandlerB() {}

    @Override
    void print(Request request) {
        System.out.println("B:" + request.getWord());
    }

    @Override
    String getProcessCode() {
        return "B";
    }
}
