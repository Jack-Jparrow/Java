import java.util.Random;
import java.util.Scanner;

/**
 *  定义一个类，其功能实现：随机产生10个加法计算题
 * 加数是两个1到15之间的整数，通过输入数据给出计算结果，从而最终显示正确计算结果的个数
 *
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-15 18:50:05 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-15 18:56:29
 */

public class qm2_1 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int a = r.nextInt(15) + 1;
            int b = r.nextInt(15) + 1;

            System.out.print("第" + (i + 1) + "题：" + a + " + " + b + " = ");
            
            int res = s.nextInt();

            if (a + b == res) {
                sum++;
            }
        }

        System.out.println("答对了" + sum + "题");
    }
}