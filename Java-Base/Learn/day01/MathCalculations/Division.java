package Learn.day01.MathCalculations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Division {
    //除法运算
    private static double div(double dividend, double divisor) {
        return (dividend % divisor);
    }

    public List<Integer> div(List<Integer> numbers, double divisor) {
        /*
         * 求数组中可以整除特定数的元素
         */
        List<Integer> div_list = new ArrayList<>();
        for (int temp : numbers) {
            if (div(temp, divisor) == 0) {
                div_list.add(temp);
            }
        }
        return div_list;
    }

    public int[] div(int[] numbers, double divisor) {
        List<Integer> div_list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        return div(div_list, divisor).stream().mapToInt(Integer::valueOf).toArray();
    }
}
