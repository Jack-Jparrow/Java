import java.util.Scanner;

/**
 * 输入某年某月某日，判断这一天是这一年的第几天？
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 19:24:17 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-21 07:10:14
 */

public class qm15_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("年：");
        int y = s.nextInt();
        System.out.print("月：");
        int m = s.nextInt();
        System.out.print("日：");
        int d = s.nextInt();
        
        int sum = 0;

        switch (m) {
            case 1:
                sum = 0;
                break;
            case 2:
                sum = 31;
                break;
            case 3:
                sum = 59;
                break;
            case 4:
                sum = 90;
                break;
            case 5:
                sum = 120;
                break;
            case 6:
                sum = 151;
                break;
            case 7:
                sum = 181;
                break;
            case 8:
                sum = 212;
                break;
            case 9:
                sum = 243;
                break;
            case 10:
                sum = 273;
                break;
            case 11:
                sum = 304;
                break;
            case 12:
                sum = 334;
                break;
        
            default:
                break;
        }

        int flag = 0;
        sum += d;

        if (m >= 1 && m <= 12 && d >= 1 && d <= 31) {
            if (y % 4 == 0 || y % 400 == 0 && y % 100 != 0) {
                flag = 1;
            }
        

            if (flag == 1) {
                if (m >= 2) {
                    sum++;
                    System.out.println(y + "年的第" + sum + "天");
                }else{
                    System.out.println(y + "年的第" + d + "天");
                }
            }else{
                if (m >= 2) {
                    System.out.println(y + "年的第" + sum + "天");
                }else{
                    System.out.println(y + "年的第" + d + "天");
                }
            }
        }
    }
}