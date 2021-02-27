/**
 * 设计一个程序求解e的值。精度达到10^-6。e=1+1/1!+1/2!+……1/n!
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-13 21:03:06
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-13 21:16:08
 */

public class qm18 {

    public static void main(String[] args) {
        double sum = 1;
        double e = 1;
        int i = 1;
        double jc = 0;

        while (sum < Math.pow(10, 100000)) {
            sum *= i;
            jc = 1.0 / sum;
            e = jc + e;
            i++;
        }

        System.out.println(e);
    }
}