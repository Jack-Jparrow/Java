/**
 * 编写一个类chongzai,该类中有3个重载的方法 void print(),在主方法中进行测试。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-15 19:17:19 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-15 19:24:57
 */
class ChongZai4_1{
    void print(int a, int b){
        System.out.println(a + " 和 " + b + " 中较大的是：" + (a > b ? a : b));
    }
    void print(int a, int b, int c){
        System.out.println(a + " 和 " + b + " 和 " + c +  "中较小的是：" + (a < b ? (a < c ? a : c) : (b <c ? b : c)));
    }
    void print(int a, int b, double c, double d){
        System.out.println(a + " " + b + " " + c + " " + d + " " + "的和是：" + (a + b + c + d));
    }
}

public class qm4_1 {

    public static void main(String[] args) {
        ChongZai4_1 cz = new ChongZai4_1();

        cz.print(3, 5);
        cz.print(-9, 5, 0);
        cz.print(5, -9, 3.3, -5.6);
    }
}