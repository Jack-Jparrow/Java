import java.util.Scanner;

/**
 * 输入一个字符，判断其种类。 
 * 按数字0-9，大写字母，小写字母，控制字符（ASCII码中的前32个）和其他这五类判断。
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-14 08:48:32
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-14 09:11:37
 */

public class qm23 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入一个字符：");
        String a = s.next();

        int b = a.getBytes()[0];

        if (b >= 48 && b <= 57) {
            System.out.println("数字");
        } else if (b >= 65 && b <= 90) {
            System.out.println("大写字母");
        } else if (b >= 97 && b <= 122) {
            System.out.println("小写字母");
        } else if (b >= 0 && b <= 31 || b == 127) {
            System.out.println("控制字符");
        } else {
            System.out.println("其他");
        }
    }
}