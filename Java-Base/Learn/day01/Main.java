package Learn.day01;

import Learn.day01.GuessNumbers.GuessNumbers;
import Learn.day01.MathCalculations.Division;
import Learn.day01.MathCalculations.Summation;
import Learn.day01.NumericSorting.Maximum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        // 2. 设计一个函数（方法），要求可以计算三个整数的最大值，比如输入1,2,3，则返回3
        System.out.println("\n----------------------------------------------------------------"
                + "\n请输入若干个整数，并且使用,(英文半角)进行分割，例如：1,2,3");
        ArrayList<Integer> max_list = ((ArrayList<Integer>) new ArrayList<>(Arrays.asList(sc.nextLine().split(","))).stream().map(Integer::valueOf).collect(Collectors.toList()));
        System.out.println(max_list.get(0) + "," + max_list.get(1) + "," + max_list.get(2) + "中最大值为" + max.maximun(max_list));

        // 3. 设计一个函数（方法），要求可以计算两个整数的范围之和
        System.out.println("\n----------------------------------------------------------------"
                + "\n设计一个函数（方法），要求可以计算两个整数的范围之和");

        System.out.println("\n----------------Part 3----------------");
        // 登录功能

        System.out.println("\n----------------Part 4----------------");
        // 随机数游戏
        GuessNumbers.guess();

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