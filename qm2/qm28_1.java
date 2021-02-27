import java.util.Scanner;

/**
 * 采用面向对象思想设计求矩形面积。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-17 18:16:33 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-17 18:23:17
 */

class Size28_1{

    double length;
    double width;

    public void res(){
        System.out.println("面积是：" + length * width);
    }
}

public class qm28_1 {

    public static void main(String[] args) {
        Size28_1 si = new Size28_1();
        Scanner s = new Scanner(System.in);
        System.out.print("长：");
        si.length = s.nextDouble();
        System.out.print("宽：");
        si.width = s.nextDouble();

        si.res();

    }
}