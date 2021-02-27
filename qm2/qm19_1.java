/**
 * 如果今天是星期二，编程实现100天后是星期几？
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 20:50:11 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-20 20:12:06
 */

public class qm19_1 {

    public static void main(String[] args) {
        int week;
        week = 100 % 7;
        int day = week + 2;
        if (day > 7) {
            day -= 7;
        }
        switch (day) {
            case 1:
                System.out.println("如果今天是星期六，100天后是星期一");
                break;
            case 2:
                System.out.println("如果今天是星期日，100天后是星期二");
                break;
            case 3:
                System.out.println("如果今天是星期一，100天后是星期三");
                break;
            case 4:
                System.out.println("如果今天是星期二，100天后是星期四");
                break;
            case 5:
                System.out.println("如果今天是星期三，100天后是星期五");
                break;
            case 6:
                System.out.println("如果今天是星期四，100天后是星期六");
                break;
            case 7:
                System.out.println("如果今天是星期五，100天后是星期日");
                break;
        
            default:
                break;
        }
    }
}