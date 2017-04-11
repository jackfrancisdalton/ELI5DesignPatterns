package behavioural.strategy.concept;

public class Main {
    public static void main(String[] args) {
        new StrategyExecutor(new StrategyA()).run();
        new StrategyExecutor(new StrategyB()).run();
    }
}
