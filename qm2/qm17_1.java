/**
 * 判断101——200之间有多少个素数，并输出所有素数。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 20:31:48 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-16 20:38:02
 */

public class qm17_1 {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 101; i < 200; i++) {
            int flag = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                }
            }

            if (flag == 0) {
                count++;
                System.out.print(i + " ");
            }
        }

        System.out.println("\n" +"有" + count + "个素数");
    }
}