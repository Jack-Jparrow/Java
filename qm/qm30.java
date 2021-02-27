import java.util.Random;

/**
 * 用java语言编写一个可以求20个范围在1－100之间随机整数和的程序。
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-14 18:43:21
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-14 19:05:32
 */

public class qm30 {

    public static void main(String[] args) {
        Random r = new Random();

        int sum = 0;
        int[] a = new int[20];

        for (int i = 0; i < 20; i++) {

            a[i] = r.nextInt(100) + 1;
            sum += a[i];

        }

        System.out.println(sum);
    }
}