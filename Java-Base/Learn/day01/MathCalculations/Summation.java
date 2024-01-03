package Learn.day01.MathCalculations;

import java.util.List;

public class Summation {
    public <T extends Number> T sum(List<T> numbers) {
        return sum(numbers, 0, 1);
    }

    public <T extends Number> T sum(List<T> numbers, Integer start, Integer step) {
        T sum_temp = numbers.get(start);
        for (int i = start + step; i < numbers.size(); i += step) {
            T value = numbers.get(i);
            sum_temp = (T) sum((value), sum_temp);
        }
        return sum_temp;
    }

    private <T extends Number> Double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}
