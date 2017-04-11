package behavioural.strategy.concept;

/**
 * Created by jackfrancisdalton on 10/04/17.
 */
public class StrategyB implements Strategy {
    @Override
    public void run(String value) {
        System.out.println("B:" + value);
    }
}
