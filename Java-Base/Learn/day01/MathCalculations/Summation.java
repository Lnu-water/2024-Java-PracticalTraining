package Learn.day01.MathCalculations;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.List;

public class Summation {
    public <T> T sum(List<T> numbers) {
        return sum(numbers, 0, 1);
    }

    public <T> T sum(List<T> numbers, Integer start, Integer step) {
        T sum_temp = numbers.get(start);
        for (T value : numbers.subList(start + step, numbers.size())) {
            sum_temp = sum(value, sum_temp);
        }
        return sum_temp;
    }

    private <T extends Number> T sum(T num1, T num2) {
        return (String) (num1.doubleValue() + num2.doubleValue());
    }


}
