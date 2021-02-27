/**
 * 用java语言编写一个程序，有两个类，
 * 其中类MAX中具有两个方法，方法名都是max，
 * 一个方法能够比较两个数的大小，另外一个方法能够比较三个数的大小。
 * 在另外一个类中创建对象，调用这两个方法，
 * 分别输出两组数：2、6；8、7、2的最大值。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-17 19:17:47 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-17 19:27:12
 */

class MAX34_1{

    public void max(int a, int b){
        System.out.println(a + " 和 " + b + " 中，较大的是：" + (a > b ? a :b));
    }

    public void max(int a, int b, int c){
        System.out.println(a + " 和 " + b + " 和 " + c + " 中，较大的是：" + (a > b ? (a > c ? a: c) : (b > c ? b : c)));
    }
}

public class qm34_1 {

    public static void main(String[] args) {
        MAX34_1 m = new MAX34_1();
        m.max(2, 6);
        m.max(8, 7, 2);
    }
}