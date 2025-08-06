import java.util.List;
import java.util.Arrays;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        int countPos = 0, countNeg = 0, countZero = 0;
        int total = arr.size();

        for (int num : arr) {
            if (num > 0) countPos++;
            else if (num < 0) countNeg++;
            else countZero++;
        }

        System.out.printf("%.6f\n", (double) countPos / total);
        System.out.printf("%.6f\n", (double) countNeg / total);
        System.out.printf("%.6f\n", (double) countZero / total);
    }

    public static void main(String[] args) {
        // Sample input: -4, 3, -9, 0, 4, 1
        List<Integer> numbers = Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(numbers);
    }
}
