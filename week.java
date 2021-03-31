import java.util.Scanner;

/**
 * 基姆拉尔森计算公式
 *
 * @Author: Jack Jparrow
 * @Date: 2021-04-01 07:41:44
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-04-01 07:54:17
 */

public class week {
    public static void main(String[] args) {
        int y;// 年
        int m;// 月
        int d;// 日
        int w;// 周

        Scanner sc = new Scanner(System.in);
        System.out.print("年：");
        y = sc.nextInt();
        System.out.print("月：");
        m = sc.nextInt();
        System.out.print("日：");
        d = sc.nextInt();
        sc.close();

        w = (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400 + 1) % 7;

        switch (w) {
        case 1:
            System.out.println("星期一");
            break;
        case 2:
            System.out.println("星期二");
            break;
        case 3:
            System.out.println("星期三");
            break;
        case 4:
            System.out.println("星期四");
            break;
        case 5:
            System.out.println("星期五");
            break;
        case 6:
            System.out.println("星期六");
            break;
        case 0:
            System.out.println("星期日");
            break;

        default:
            break;
        }
    }
}
