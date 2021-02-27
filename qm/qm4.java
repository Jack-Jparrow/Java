/**
 * 编写一个类chongzai,该类中有3个重载的方法 void print(),在主方法中进行测试。
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-12 09:16:30
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-12 09:37:56
 */

class ChongZai {
    void print(int a, int b) {

        System.out.println(a + " 和 " + b + " 相比，较大的是：" + (a > b ? a : b));
    }

    void print(double a, double b) {

        System.out.println(a + " 和 " + b + " 的乘积和 " + b + " 相比，较小的是：" + ((a * b) < b ? (a * b) : b));
    }

    void print(int a, double b, float c) {

        System.out.println(a + " 和 " + b + " 和 " + c + " 相比，较大的是：" + (a > b ? (a > c ? a : c) : (b > c ? b : c)));
    }
}

public class qm4 {

    public static void main(String[] args) {
        ChongZai cz = new ChongZai();
        cz.print(10, 5);
        cz.print(2.2, 0.5);
        cz.print(2, 6.322222, -0.5f);

    }
}