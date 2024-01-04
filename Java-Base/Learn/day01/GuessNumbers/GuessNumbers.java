package Learn.day01.GuessNumbers;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumbers {
    public static void guess() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------" +
                "\n欢迎来到随机数的游戏，游戏规则如下：" +
                "\n1. 玩家可以选择是否输入猜测数据的范围，若是则系统会根据范围生成一个随机数，否则系统会生成一个1到100之间的随机数；" +
                "\n2. 游戏开始后玩家需要输入一个1到100之间的整数，若猜对了则游戏结束，若猜错了则系统会提示玩家猜的数字偏大还是偏小；" +
                "\n3. 游戏结束前玩家可以无限次猜测，直至游戏结束，系统将自动记录玩家猜测的次数；" +
                "\n4. 游戏开始后玩家可以输入 n(N) 退出游戏。" +
                "\n5. 输入 y(Y) 开始游戏" +
                "\n----------------------------------------------------------------");
        while (true) {
            try {
                if (sc.nextLine().equalsIgnoreCase("y"))
                    System.out.println("请输入需要猜测的整数范围，例如：1 100");
                else {
                    System.out.println("玩家退出游戏");
                    return;
                }
                String[] bollean = sc.nextLine().split(" ");
                if (bollean[0].equalsIgnoreCase("n")) {
                    System.out.println("玩家退出游戏");
                    return;
                } else if (bollean.length != 2) throw new InputMismatchException("输入格式错误，请重新输入");
                int[] nums = Arrays.stream(bollean).mapToInt(Integer::valueOf).toArray();
                System.out.printf("系统会随机生成一个 %d 到 %d 之间的整数%n",
                        Math.min(nums[0], nums[1]),
                        Math.max(nums[0], nums[1]));
                System.out.println("整数生成成功");
                Random random = new Random();
                int num_random = random.nextInt(((nums[0] - nums[1]) >= 0) ? (nums[0] - nums[1]) : (nums[1] - nums[0]))
                        + (((nums[0] - nums[1]) >= 0) ? nums[1] : nums[0]);
                int count = 1;
                while (true) {
                    System.out.println("请输入猜测的整数");
                    int num_guesses = sc.nextInt();
                    if (num_guesses == num_random) {
                        System.out.println("恭喜你，猜对了" +
                                "\n你总共猜了" + count + "次");
                        break;
                    } else if (num_guesses > num_random) {
                        System.out.println("猜大了");
                    } else {
                        System.out.println("猜小了");
                    }
                    count++;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("还想继续游戏吗？输入 y(Y) 继续游戏，输入其他任意字符退出游戏");
            sc.nextLine();
        }
    }
}


