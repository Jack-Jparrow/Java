import java.util.Scanner;

/**
 * 输入一个串，判断它是不是回文。如“abcba”是回文。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 18:40:49 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-16 19:12:18
 */

public class qm12_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入一个串：");
        String str1 = s.nextLine();
        
        StringBuilder sb = new StringBuilder(str1).reverse();
        String str2 = sb.toString();

        if (str1.equals(str2)) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }
    }
}