import java.util.Scanner;

/**
 * 采用面向对象思想设计求矩形面积。
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-14 18:20:11
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-14 18:27:11
 */

class Area {
    double length;
    double width;

    public void size() {
        System.out.println("矩形面积是：" + length * width);
    }
}

public class qm28 {

    public static void main(String[] args) {
        Area a = new Area();
        Scanner s = new Scanner(System.in);

        System.out.print("请输入长：");
        a.length = s.nextDouble();
        System.out.print("请输入宽：");
        a.width = s.nextDouble();

        a.size();
    }
}