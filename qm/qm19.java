/**
 * 如果今天是星期二，编程实现100天后是星期几？
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-13 21:16:38 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-16 20:52:50
 */

public class qm19 {

    public static void main(String[] args) {
        int x = 100 % 7;
        int day = x + 2;

        switch (day) {
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
            case 7:
                System.out.println("星期日");
                break;
            default:
                break;
        }
    }
}