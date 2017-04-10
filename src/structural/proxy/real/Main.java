package structural.proxy.real;

/**
 * Created by jackfrancisdalton on 06/04/17.
 */
public class Main {

    public static void main(String[] args) {
        IBankAccountProxy accountProxy = new BankAccountAccessor();

    }
}
