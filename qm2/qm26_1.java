import java.util.Scanner;

/**
 * 猜数字游戏：一个类A有一个成员变量v，有一个初值100。 
 * 定义一个类，队A类的成员变量进行猜。 如果大了则提示大了，小了则提示小了，等于则提示猜测成功。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-17 17:55:46 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-17 18:02:06
 */

class A26_1{
    int v = 100;
}

public class qm26_1 {

    public static void main(String[] args) {
        A26_1 a = new A26_1();
        int x = a.v;
        int y;

        do {
            Scanner s = new Scanner(System.in);
            System.out.print("请输入一个数字：");
            y = s.nextInt();
            if (y > x) {
                System.out.println("大了");
            }else if(y < x){ 
                System.out.println("小了");
            }else{
                System.out.println("猜对了");
            }
        } while (x != y);
        
    }
}