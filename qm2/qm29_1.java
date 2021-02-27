import java.util.Random;

/**
 * 采用面向对象思想设计求两点间的距离， 
 * 要求这两点的横纵坐标由随机产生在0——20之间的整数， 
 * 且保证两点不重合。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-17 18:23:45 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-21 07:30:05
 */

class Point29_1{
    Random r = new Random();

    int x1 = r.nextInt(21) + 0;
    int y1 = r.nextInt(21) + 0;
    int x2 = r.nextInt(21) + 0;
    int y2 = r.nextInt(21) + 0;

    double dis;

    public void distance() {
        while (x1 != x2 && y1 != y2) {
            dis = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
            System.out.printf("距离为：%.2f", dis);
            break;
        }
        if (x1 == x2 || y1 == y2) {
            x1 = r.nextInt(21) + 0;
            y1 = r.nextInt(21) + 0;
            x2 = r.nextInt(21) + 0;
            y2 = r.nextInt(21) + 0;
            dis = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
            System.out.printf("距离为：%.2f", dis);

        }
    }
}

public class qm29_1 {

    public static void main(String[] args) {
        Point29_1 p = new Point29_1();

        p.distance();
    }
}