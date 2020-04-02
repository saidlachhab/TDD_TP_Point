package moyenne;

import java.util.Arrays;

public class MeanCalculator {


    public static Double mean(int[] array) {
        return Arrays.stream(array).average().orElseThrow(()->new ArithmeticException("impossible de calculer la moyenne arithmetique"));
    }
}
