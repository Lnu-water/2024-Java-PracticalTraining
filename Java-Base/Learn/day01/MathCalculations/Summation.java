package Learn.day01.MathCalculations;

public class Summation {
    private static int sum(int i, int j) {
        return i + j;
    }

    public int sum(int[] list) {
        return sum(list, 0, 1);
    }

    public int sum(int[] list, int start, int step) {
        int sum_temp = 0;
        for (int i = start; i < list.length; i += step) {
            int temp = list[i];
            sum_temp = sum(temp, sum_temp);
        }
        return sum_temp;
    }


}
