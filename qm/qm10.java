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
 * @Date: 2020-12-13 15:41:51
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-15 19:25:56
 */

public class qm10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        // 建议：以样例为准，尽量以个位数实验结果

        System.out.print("s1 = ");
        String s1 = sc.nextLine();
        System.out.print("len1 = ");
        int len1 = sc.nextInt();

        System.out.print("s2 = ");
        String s2 = sc2.nextLine();
        System.out.print("len2 = ");
        int len2 = sc2.nextInt();

        int count = 0;
        int len = 0;
        StringTokenizer st1 = new StringTokenizer(s1);
        String[] arr1 = new String[st1.countTokens()];
        StringTokenizer st2 = new StringTokenizer(s2);
        String[] arr2 = new String[st2.countTokens()];

        for (int i = 0; st1.hasMoreTokens(); i++) {
            arr1[i] = st1.nextToken();
        }

        for (int i = 0; st2.hasMoreTokens(); i++) {
            arr2[i] = st2.nextToken();
        }

        if (len1 >= len2) {
            len = len2;
        } else {
            len = len1;
        }

        for (int i = 0; i < len; i++) {
            if (!arr1[len1 - i - 1].equals(arr2[len2 - i - 1])) {
                count++;
            }
        }

        System.out.println(count);
    }
}