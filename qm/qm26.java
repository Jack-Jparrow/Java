import java.util.Scanner;

/**
 * 猜数字游戏：一个类A有一个成员变量v，有一个初值100。 
 * 定义一个类，队A类的成员变量进行猜。 如果大了则提示大了，小了则提示小了，等于则提示猜测成功。
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-14 09:41:31
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-14 18:06:06
 */

class A {
    int v = 100;
}

public class qm26 {

    public static void main(String[] args) {
        A a = new A();

        int x = a.v;
        int y;

        do {
            Scanner s = new Scanner(System.in);
            System.out.print("输入一个数：");
            y = s.nextInt();

            if (x > y) {
                System.out.println("猜小了");
            } else if (y > x) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜对了");
            }
        } while (x != y);

    }
}