import java.util.Scanner;

/**
 * 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 18:30:27 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-21 07:06:36
 */

public class qm11_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入元素个数：");
        int[] a = new int[s.nextInt()];
        for (int i = 0; i < a.length; i++) {
            System.out.print("第" + (i + 1) + "个数：");
            a[i] = s.nextInt();
        }

        System.out.print("原数组：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "   ");
        }

        int max = a[0];
        int min = a[0];
        int x = 0;
        int y = 0;
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                x = i;
            }
            if (min > a[i]) {
                min = a[i];
                y = i;
            }
        }

        temp = a[0];
        a[0] = a[x];
        a[x] = temp;

        temp = a[a.length - 1];
        a[a.length - 1] = a[y];
        a[y] = temp;

        System.out.print("\n新数组：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "   ");
        }
    }
}