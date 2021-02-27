import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 输入字符串长度len1,字符串s1，字符串长度为len2, 字符串s2。 
 * 从后向前比较，以最短字符串为标准，输出不同的元素的个数。 
 * 例如：
 * 输入：s1="1,3,5” len1=3 s2="2,4,1,7,5" len2=5 
 * 输出：1
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 18:02:28 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-16 18:30:12
 */

public class qm10_1 {

    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("s1 = ");
        String s1 = sa.nextLine();
        System.out.print("len1 = ");
        int len1 = sa.nextInt();

        Scanner sb = new Scanner(System.in);
        System.out.print("s2 = ");
        String s2 = sb.nextLine();
        System.out.print("len2 = ");
        int len2 = sb.nextInt();

        int len;
        int count = 0;

        StringTokenizer st1 = new StringTokenizer(s1);
        String[] sc1 = new String[st1.countTokens()];
        for (int i = 0; st1.hasMoreTokens(); i++) {
            sc1[i] =st1.nextToken();
        }

        StringTokenizer st2 = new StringTokenizer(s2);
        String[] sc2 = new String[st2.countTokens()];
        for (int i = 0; st2.hasMoreTokens(); i++) {
            sc2[i] =st2.nextToken();
        }

        if (len1 >= len2) {
            len = len2;
        }else{
            len = len1;
        }

        for (int i = 0; i <len; i++) {
            if (!sc1[len1 - 1 - i].equals(sc2[len2 - 1 - i])) {
                count++;
            }
        }

        System.out.println(count);
    }
}