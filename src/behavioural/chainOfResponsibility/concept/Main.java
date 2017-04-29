package behavioural.chainOfResponsibility.concept;

/**
 * Created by jackfrancisdalton on 12/04/17.
 */
public class Main {
    public static void main(String[] args) {
        //Declare the processes
        AbstractHandler pa =  new HandlerA();
        AbstractHandler pb = new HandlerB();
        AbstractHandler pc = new HandlerC();

        //Chain the processes
        pa.setNextHandler(pb);
        pb.setNextHandler(pc);

        //Pass through A, until and call B
        pa.executeProcess(new Request("Hello World!", "B"));

        //Pass process A and B, and call on C
        pa.executeProcess(new Request("Hello World!!", "C"));

        //Pass all processes and handle unsupported process
        pa.executeProcess(new Request("Hello World!!!", "F"));
    }

    public static void print(String vlaue) {
        System.out.println(vlaue);
    }
}
