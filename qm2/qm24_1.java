import java.util.Scanner;

/**
 * 有一个数列：8, 4, 2, 1, 23, 344, 12，编辑实现以下功能。
 * 循环输出数列的值；求数列中所有数值的和；
 * 猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含该数。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 21:33:45 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-16 21:34:05
 */

public class qm24_1 {

    public static void main(String[] args) {
        int[] a = {8, 4, 2, 1, 23, 344, 12};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "   ");
            sum += a[i];
        }

        System.out.println();
        System.out.println(sum);

        Scanner s = new Scanner(System.in);
        System.out.print("输入一个要判断的数：");
        int n = s.nextInt();

        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) {
                flag = 1;
            }
        }

        if (flag == 1) {
            System.out.println("包含");
        }else{
            System.out.println("不包含");
        }
    }
}