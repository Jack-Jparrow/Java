import java.util.Scanner;

/**
 * 冒泡排序
 *
 * @Author: Jack Jparrow
 * @Date: 2021-04-16 09:38:32
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-04-16 09:59:12
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        sort(str);
        // System.out.println();
    }

    static void swap(char[] c, int i, int j) {
        char t;
        t = c[i];
        c[i] = c[j];
        c[j] = t;
    }

    static void sort(String str) {
        char[] c = str.toCharArray();
        int count = 0;

        for (int i = 0; i < c.length; i++) {
            for (int j = c.length - 2; j >= i; j--) {
                if (c[j] > c[j + 1]) {
                    swap(c, j, j + 1);
                    count++;
                }
            }
            // System.out.println(c[i]);
        }

        for (char d : c) {
            System.out.print(d);
        }

        System.out.println();
        System.out.println(count);
    }
}
