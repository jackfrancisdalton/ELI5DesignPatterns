package behavioural.chainOfResponsibility.real;

public abstract class CashDespenser {
    protected CashDespenser nextDespenser;

    protected void setNextChain(CashDespenser nextChain) {
        this.nextDespenser = nextChain;
    }
    abstract void dispense(CashRequest request);
}
