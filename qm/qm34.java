/**
 * 用java语言编写一个程序，有两个类，
 * 其中类MAX中具有两个方法，方法名都是max，
 * 一个方法能够比较两个数的大小，另外一个方法能够比较三个数的大小。
 * 在另外一个类中创建对象，调用这两个方法，
 * 分别输出两组数：2、6；8、7、2的最大值。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-14 20:11:18 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-17 19:27:42
 */

class Max{

    public void max(int x, int y){
        System.out.println("这组数的最大值是：" + (x > y ? x : y));
    }

    public void max(int x, int y, int z){
        System.out.println("这组数的最大值是：" + (x > y ? (x > z ? x :z) : (y > z ? y : z)));
    }
}

public class qm34 {

    public static void main(String[] args) {
        Max m = new Max();
        m.max(2, 6);
        m.max(8, 7, 2);
    }
}