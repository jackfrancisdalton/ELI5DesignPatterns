package behavioural.strategy.real;

import java.util.List;

public class BubbleSort implements SortStrategy {
    public BubbleSort() {}

    public int[] sortNumbers(int[] numArray) {
        int n = numArray.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
        return numArray;
    }
}
