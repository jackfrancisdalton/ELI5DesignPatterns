package behavioural.chainOfResponsibility.concept;

/**
 * Created by jackfrancisdalton on 12/04/17.
 */
public abstract class Process {
    private Process nextProcess;

    abstract void printWord(Request request);
    abstract String getProcessCode();

    public void executeProcess(Request request){
        if (request.getProcessType().equals(getProcessCode())) {
            printWord(request);
        } else if (nextProcess != null) {
            nextProcess.executeProcess(request);
        } else {
            System.out.println("Requested process does not exist");
        }
    }

    public Process getNextPorcess() {
        return nextProcess;
    }

    public void setNextPorcess(Process nextPorcess) {
        this.nextProcess = nextPorcess;
    }
}
