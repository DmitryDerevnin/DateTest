package impl.other.impl;

import java.util.Arrays;

public class SumChecker {
    public boolean checkSum(String stringOfNumbers) {
        double[] numbers = Arrays.stream(stringOfNumbers.split("\\s")).
                mapToDouble(Double::parseDouble).toArray();
        return numbers[0] + numbers[1] == numbers[2];
    }

}
