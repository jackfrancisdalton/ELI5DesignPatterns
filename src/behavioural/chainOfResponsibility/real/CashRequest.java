package behavioural.chainOfResponsibility.real;

/**
 * Created by jackfrancisdalton on 12/04/17.
 */
public class CashRequest {
    private int amount;

    public CashRequest(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
