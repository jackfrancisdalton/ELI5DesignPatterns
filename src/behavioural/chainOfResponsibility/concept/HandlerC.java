package behavioural.chainOfResponsibility.concept;

/**
 * Created by jackfrancisdalton on 12/04/17.
 */
public class HandlerC extends AbstractHandler {

    public HandlerC() {}

    @Override
    void print(Request request) {
        System.out.println("C:" + request.getWord());
    }

    @Override
    String getProcessCode() {
        return "C";
    }
}
