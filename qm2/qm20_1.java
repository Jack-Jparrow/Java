import java.util.Scanner;

/**
 * 用java语言编写一个求n个数的平均值及最小值的程序。
 * 要求：程序执行时，用户先由键盘输入n的值，
 * 之后输入n个数，
 * 最后，程序显示平均值和最小值。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 20:57:00 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-20 20:16:34
 */

public class qm20_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("算几个数？");
        int n = s.nextInt();
        double[] a = new double[n];
        double sum = 0;


        for (int i = 0; i < n; i++) {
            System.out.print("第" + (i+ 1) + "个数：");
            a[i] = s.nextDouble();
        }

        double min = a[0];

        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        double avg = sum / n;

        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }

        System.out.println("平均值是：" + avg);
        System.out.println("最小值是：" + min);
    }
}