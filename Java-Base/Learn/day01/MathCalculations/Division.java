package Learn.day01.MathCalculations;

import java.util.ArrayList;
import java.util.List;

public class Division {
    // 返回求余后的值
    private static <T extends Number> double div(T dividend, T divisor) {
        return dividend.doubleValue() % divisor.doubleValue();
    }

    public <T extends Number> List<T> div(List<T> numbers, T divisor) {
        /*
         * 求数组中可以整除特定数的元素
         */
        List<T> div_list = new ArrayList<>();
        for (T temp : numbers) if (div(temp, divisor) == 0) div_list.add(temp);
        return div_list;
    }
}
