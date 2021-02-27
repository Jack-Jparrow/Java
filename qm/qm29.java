import java.util.Random;

/**
 * 采用面向对象思想设计求两点间的距离， 
 * 要求这两点的横纵坐标由随机产生在0——20之间的整数， 
 * 且保证两点不重合。
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-14 18:28:19
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-14 18:57:22
 */
class Point {

    Random r = new Random();

    int a1 = r.nextInt(21) + 0;
    int b1 = r.nextInt(21) + 0;
    int a2 = r.nextInt(21) + 0;
    int b2 = r.nextInt(21) + 0;

    double distance;

    public void count() {
        do {
            distance = Math.sqrt(((a1 - a2) * (a1 - a2)) + ((b1 - b2) * (b1 - b2)));

            System.out.println("两点之间距离为：" + distance);

            break;
        }while(a1 != a2 && b1 != b2) ;
    }
}

public class qm29 {

    public static void main(String[] args) {
        Point p = new Point();

        p.count();
    }
}