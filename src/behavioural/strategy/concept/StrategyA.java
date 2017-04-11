package behavioural.strategy.concept;

/**
 * Created by jackfrancisdalton on 10/04/17.
 */
public class StrategyA implements Strategy {
    @Override
    public void run(String value) {
        System.out.println("A:" + value);
    }
}
