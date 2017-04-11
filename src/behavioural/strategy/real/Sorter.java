package behavioural.strategy.real;

import java.util.List;

/**
 * Created by jackfrancisdalton on 10/04/17.
 */
public class Sorter {
    private SortStrategy strategy;

    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public int[] sortNumber(int[] numbers) {
        return strategy.sortNumbers(numbers);
    }
}
