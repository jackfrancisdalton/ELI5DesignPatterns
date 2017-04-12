package behavioural.chainOfResponsibility.real;


public class ImpCashDespenser extends CashDespenser {
    int noteValue;
    int numberOfNotes;

    public ImpCashDespenser(int noteValue, int numberOfNotes) {
        this.noteValue = noteValue;
        this.numberOfNotes = numberOfNotes;
    }

    @Override
    void dispense(CashRequest request) {
        if(request.getAmount() >= noteValue){
            int num = request.getAmount()/noteValue;
            int remainder = request.getAmount();

            for (int i = 0; i < num; i++) {
                if(numberOfNotes <= 0)
                    break;

                remainder -= noteValue;
                System.out.println("Dispensing " + noteValue + "$ note");
                numberOfNotes--;
            }

            if(remainder !=0)
                super.nextDespenser.dispense(new CashRequest(remainder));

        } else {
            this.nextDespenser.dispense(request);
        }
    }
}
