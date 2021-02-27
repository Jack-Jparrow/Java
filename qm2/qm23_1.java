import java.util.Scanner;

/**
 * 输入一个字符，判断其种类。 
 * 按数字0-9，大写字母，小写字母，控制字符（ASCII码中的前32个）和其他这五类判断。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 21:23:17 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-02-24 20:22:51
 */

public class qm23_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入一个字符：");
        String a = s.next();
        byte[] x = a.getBytes();
        int c = (int)x[0];

        if (c >= 48 && c <= 57) {
            System.out.println("数字");
        }else if (c >= 65 && c <= 90) {
            System.out.println("大写字母");
        }else if (c >= 97 && c <= 122) {
            System.out.println("小写字母");
        }else if (c >= 0 && c <= 31 || c == 127) {
            System.out.println("控制字符");
        }else{
            System.out.println("其他");
        }
    }
}