import java.util.Scanner;

/**
 * 输入一个年份，判断是否是闰年。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-14 08:14:23 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-14 08:25:48
 */

public class qm21 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入年：");
        int a = s.nextInt();
        
        if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) {
            System.out.println("是闰年");
        } else {
            System.out.println("不是闰年");
        }

    }
}