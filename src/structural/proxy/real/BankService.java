package structural.proxy.real;

/**
 * Created by jackfrancisdalton on 06/04/17.
 */
public class BankService {
    private static String accountName = "Steve";
    private static int accountBalance = 1000;

    public static int getBankAccountValue() {
        return accountBalance;
    }

    public static String getAccountName() {
        return accountName;
    }

    public static void setBankAccountValue(String newAccountName) {
        accountName = newAccountName;
    }

    public static void setAccountName(int newAccountBalance) {
        accountBalance = newAccountBalance;
    }
}
