package Learn.day01.NumericSorting;

import java.util.List;

public class Maximum {
    public <T extends Comparable<T>> T maximun(List<T> values) {
        T max_value = values.get(0);
        for (T value : values.subList(1, values.size())) {
            max_value = value.compareTo(max_value) > 0 ? value : max_value;
        }
        return max_value;
    }
}