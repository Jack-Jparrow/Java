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
 * @Last Modified time: 2021-03-08 19:07:52
 */

public class qm10_2 {

    public static void main(String[] args) {
        String s1 = "1, 3, 5";
        System.out.println("s1 = \"" + s1 + "\"");

        int len;
        int count = 0;

        StringTokenizer st1 = new StringTokenizer(s1);
        String[] sc1 = new String[st1.countTokens()];
        for (int i = 0; st1.hasMoreTokens(); i++) {
            sc1[i] =st1.nextToken();
        }

        int len1 = sc1.length;
        System.out.println("len1 = " + len1);

        String s2 = "2, 4, 1, 7, 5";
        System.out.println("s2 = \"" + s2 + "\"");

        StringTokenizer st2 = new StringTokenizer(s2);
        String[] sc2 = new String[st2.countTokens()];
        for (int i = 0; st2.hasMoreTokens(); i++) {
            sc2[i] = st2.nextToken();
        }

        int len2 = sc2.length;
        System.out.println("len2 = " + len2);

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