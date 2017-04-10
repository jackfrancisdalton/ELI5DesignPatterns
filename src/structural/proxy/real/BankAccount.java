package structural.proxy.real;

/**
 * Created by jackfrancisdalton on 06/04/17.
 */
public class BankAccount {
    private String accountHoldeName;
    private int balance;

    public BankAccount(String accountHoldeName, int balance) {
        this.accountHoldeName = accountHoldeName;
        this.balance = balance;
    }

    public String getAccountHoldeName() {
        return accountHoldeName;
    }

    public void setAccountHoldeName(String accountHoldeName) {
        this.accountHoldeName = accountHoldeName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
