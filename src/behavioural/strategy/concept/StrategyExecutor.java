package behavioural.strategy.concept;

/**
 * Created by jackfrancisdalton on 10/04/17.
 */
public class StrategyExecutor {
    private Strategy strategy;

    public StrategyExecutor(Strategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.run("WORD");
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
