import java.util.Random;

/**
 * 用java语言编写一个可以求20个范围在1－100之间随机整数和的程序。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-17 18:31:27 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-17 18:38:48
 */

public class qm30_1 {

    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        // int count = 0;

        for (int i = 0; i < 10; i++) {
            int a = r.nextInt(100) + 1;
            int b = r.nextInt(100) + 1;

            sum += (a + b);

            System.out.print(a +"  ");
            System.out.print(b +"  ");
            // System.out.print(",");
            // count++;
        }
        System.out.println();
        System.out.println(sum);
        // System.out.println(count);
    }
}