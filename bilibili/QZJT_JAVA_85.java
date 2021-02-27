/**
 * 异常-越界
 *
 * @Author: Jack Jparrow 
 * @Date: 2021-01-16 14:53:56 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-01-16 15:46:50
 */
public class QZJT_JAVA_85 {

    public static void main(String[] args) {
        String[] str = new String[]{"a", "b", "c"};

        for (int i = 0; i < 4; i++) {
            System.out.println(str[i]);
        }
    }
}