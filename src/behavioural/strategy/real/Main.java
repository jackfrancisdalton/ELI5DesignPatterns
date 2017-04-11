package behavioural.strategy.real;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sorter s = new Sorter(new QuickSort());
        int[] integers = new int[] {1, 5, 34, 12, 1, 15, 4, 18, 26, 4, 6, 7};
        Arrays.stream(s.sortNumber(integers)).forEach(
                i -> System.out.print(i + ",")
        );
    }
}
