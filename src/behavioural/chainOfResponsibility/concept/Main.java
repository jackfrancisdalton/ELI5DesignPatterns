package behavioural.chainOfResponsibility.concept;

/**
 * Created by jackfrancisdalton on 12/04/17.
 */
public class Main {
    public static void main(String[] args) {
        Process pa =  new ProcessA();
        Process pb = new ProcessB();
        Process pc = new ProcessC();

        pa.setNextPorcess(pb);
        pb.setNextPorcess(pc);

        pa.executeProcess(new Request("Hello World", "B"));
        pa.executeProcess(new Request("Hello World", "C"));
        pa.executeProcess(new Request("Hello World", "F"));
    }
}
