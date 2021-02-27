import java.util.Scanner;
/**
 * 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-13 17:30:27
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-15 20:37:54
 */

public class qm11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("数组长度：");
        int len = s.nextInt();
        int[] a = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("第" + (i + 1) + "个元素：");
            a[i] = s.nextInt();
        }

        System.out.print("原数组：");
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + "   ");
        }
        System.out.println();

        int temp = 0;
        int[] b = new int[len];
        for (int i = 0; i < len; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        int min = a[0];
        int max = a[len - 1];

        for (int i = 0; i < b.length; i++) {
            if (b[i] == max) {
                temp = b[i];
                b[i] = b[0];
                b[0] = temp;
            }

            if (min == b[i]) {
                temp = b[i];
                b[i] = b[b.length - 1];
                a[b.length - 1] = temp;
            }
        }

        System.out.print("数组：");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + "   ");
        }
    }
}