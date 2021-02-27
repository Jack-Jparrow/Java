/**
 * 设计一个程序求解e的值。精度达到10^-6。e=1+1/1!+1/2!+……1/n!
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 20:40:34 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-16 20:49:36
 */

public class qm18_1 {

    public static void main(String[] args) {
        double e = 1;
        double sum = 1;
        int i = 1;
        double jc = 0;

        while (i < Math.pow(10, 6)) {
            sum *= i;
            jc = 1 / sum;
            e += jc;
            i++;
        }

        System.out.println(e);
    }
}