import java.util.Scanner;

/**
 *  用java语言编写一个求n个数的平均值及最小值的程序。
 * 要求：程序执行时，用户先由键盘输入n的值，
 * 之后输入n个数，
 * 最后，程序显示平均值和最小值。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-13 21:24:16 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-14 07:47:43
 */

public class qm20 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("数据个数（n）：");
        double[] n = new double[s.nextInt()];
        for (int i = 0; i < n.length; i++) {
            System.out.print("第" + (i + 1) + "个数据：");
            n[i] = s.nextDouble();
        }

        double min = n[0];
        double avg = 0;
        double sum = 0;
        
        for (int i = 0; i < n.length; i++) {
            if (min > n[i]) {
                min = n[i];

            }
        }
        System.out.println("最小值" + min);

        for (int i = 0; i < n.length; i++) {
            sum += n[i];
            avg = sum / n.length;
        }
        System.out.println("平均值：" + avg);
    }
}