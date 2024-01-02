package Learn.day01;

import Learn.day01.MathCalculations.Division;
import Learn.day01.MathCalculations.Summation;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[101];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        Summation summation = new Summation();
        Division division = new Division();
        System.out.println("----------------Part 1----------------");
        System.out.println("1. 1+2+3+...+100的和为：" + summation.sum(numbers));
        System.out.println("2. 1+2+3+...+100的偶数和为：" + summation.sum(numbers, 1, 2));
        System.out.println("3. 1+2+3+...+100的奇数和为：" + summation.sum(numbers, 0, 2));
        System.out.println("4. 1+2+3+...+100中的既能被3整除又能被6整除的数字之和为：" + summation.sum((division.div(division.div(numbers, 3), 6))));
        System.out.println("5. 九九乘法表：\n");
    }
}
