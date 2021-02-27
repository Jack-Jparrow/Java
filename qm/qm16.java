/**
 * 打印出1000以内所有的”水仙花数“，
 * 所谓”水仙花数“是指一个三位数，
 * 其各位数字立方和等于该数本身。
 * 例如：153是一个”水仙花数"
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-13 19:34:12 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-13 19:44:53
 */

public class qm16 {

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;
            int b = i % 100 / 10;
            int c = i / 100;

            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }
    }
}