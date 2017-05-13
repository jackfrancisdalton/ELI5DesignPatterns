package behavioural.chainOfResponsibility.concept;

/**
 * Abstract class that defines a handler object
 *
 *  In some cases people will use interfaces and leave getting and setting "nextHandler"
 *  to the POJO that implements it. In this case we define these in an abstract class
 */

public abstract class AbstractHandler {

    //The next handler in the chain of responsibility
    private AbstractHandler nextHandler;

    //Method each process has unique implementations for
    abstract void print(Request request);

    //Returns a string to identify the process type
    abstract String getProcessCode();

    //Checks if the current process is the desired one for the request, else passes it on
    public void executeProcess(Request request){
        if (request.getProcessType().equals(getProcessCode())) {
            print(request);
        } else if (nextHandler != null) {
            getNextHandler().executeProcess(request);
        } else {
            System.out.println("Requested process does not exist");
        }
    }

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
