package Learn.day01.MathCalculations;

import java.util.List;

public class Summation {
    private static int sum(int i, int j) {
        return i + j;
    }

    public int sum(List<Integer> numbers) {
        return sum(numbers, 0, 1);
    }

    public int sum(List<Integer> numbers, int start, int step) {
        int sum_temp = 0;
        for (int i = start; i < numbers.size(); i += step) {
            int temp = numbers.get(i);
            sum_temp = sum(temp, sum_temp);
        }
        return sum_temp;
    }


}
