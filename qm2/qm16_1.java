/**
 * 打印出1000以内所有的”水仙花数“，
 * 所谓”水仙花数“是指一个三位数，
 * 其各位数字立方和等于该数本身。
 * 例如：153是一个”水仙花数"
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 20:27:09 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-16 20:31:17
 */

public class qm16_1 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 100; i < 1000; i++) {
            a = i / 100;
            b = i % 100 / 10;
            c = i % 100 % 10;
            
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.print(i +  "    ");
            }
        }
    }
}