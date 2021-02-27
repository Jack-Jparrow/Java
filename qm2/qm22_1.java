import java.util.Scanner;

/**
 * 用java语言编写，输入一个整数n,输出图形，如输入4，则如下输出图形。
 *     *
 *    ***
 *   *****
 *  *******
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 21:16:34 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-16 21:22:54
 */

public class qm22_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("几层？");
        int a = s.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = a - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1;j <= 2 * i - 1;j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}