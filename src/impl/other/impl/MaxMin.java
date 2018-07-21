package impl.other.impl;

import java.util.Arrays;

public class MaxMin {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().getAsInt();
    }

    public int findMin(int[] numbers) {
        return Arrays.stream(numbers).min().getAsInt();
    }
}
