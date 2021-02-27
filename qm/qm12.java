import java.util.Scanner;

/**
 * 输入一个串，判断它是不是回文。如“abcba”是回文。
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-13 18:24:57
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-16 19:08:59
 */

public class qm12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        
        // 翻转字符串
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();

        String str2 = sb.toString();

        if (str1.equals(str2)) {
            System.out.println("是回文");
        }else{
            System.out.println("不是回文");
        }
    }
}