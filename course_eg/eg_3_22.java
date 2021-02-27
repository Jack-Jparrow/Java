/**
 * 距离最短的两点
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-11-26 14:28:03 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-11-26 15:14:49
 */
import java.util.Scanner;

public class eg_3_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入点的个数：");
        int numOfPoints = input.nextInt();

        // 构造数组存放各点
        double[][] points = new double[numOfPoints][2];
        System.out.println("输入 " + numOfPoints + " 个点:");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        //
        int p1 = 0;
        int p2 = 1;
        double shortDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (shortDistance > distance) {
                    p1 = i;
                    p2 = j;
                    shortDistance = distance;
                }
            }
        }

        System.out.println("最近的两点是：" + "("+ points[p1][0] + ", " + points[p1][1] + ")" + " " + "(" + points[p2][0] + ", " + points[p2][1] + ")");
    }

    public static double distance(double x1, double x2, double y1, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

}