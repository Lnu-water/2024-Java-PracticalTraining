package Learn.day01;

import Learn.day01.MathCalculations.Division;
import Learn.day01.MathCalculations.Summation;
import Learn.day01.NumericSorting.Maximum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i + 1);
        }
        Summation summation = new Summation();
        Division division = new Division();
        NineNineTable m_table = new NineNineTable();
        Maximum max = new Maximum();
        System.out.println("----------------Part 1----------------");
        System.out.println("1. 1+2+3+...+100的和为：" + summation.sum(numbers));
        System.out.println("2. 1+2+3+...+100的偶数和为：" + summation.sum(numbers, 1, 2));
        System.out.println("3. 1+2+3+...+100的奇数和为：" + summation.sum(numbers, 0, 2));
        System.out.println("4. 1+2+3+...+100中的既能被3整除又能被6整除的数字之和为：" + summation.sum((division.div(division.div(numbers, 3), 6))));
        System.out.println("\n5. 九九乘法表：");
        m_table.nine_nine_table();

        System.out.println("\n----------------Part 2----------------");
        System.out.println(max.maximun(numbers));
    }
}


class NineNineTable {
    public void nine_nine_table() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}