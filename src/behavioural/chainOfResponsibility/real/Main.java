package behavioural.chainOfResponsibility.real;

public class Main {
    public static void main(String[] args) {

        //Define despensers of specific notes
        CashDespenser cd50 = new ImpCashDespenser(50, 1);
        CashDespenser cd20 = new ImpCashDespenser(20, 3);
        CashDespenser cd10 = new ImpCashDespenser(10, 5);
        CashDespenser cd5 = new ImpCashDespenser(5, 5);
        CashDespenser cd1 = new ImpCashDespenser(1, 5);

        //Chain despensers to gracefully waterfall
        cd50.setNextChain(cd20);
        cd20.setNextChain(cd10);
        cd10.setNextChain(cd5);
        cd5.setNextChain(cd1);

        //Instantiate and execute request
        CashRequest cr = new CashRequest(127);
        cd50.dispense(cr);
    }
}
