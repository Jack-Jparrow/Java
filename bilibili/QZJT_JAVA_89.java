/**
 * 捕获异常
 *
 * @Author: Jack Jparrow
 * @Date: 2021-01-17 15:14:45
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-01-17 15:23:31
 */
class A_89 {
    int i;
}

public class QZJT_JAVA_89 {

    public static void main(String[] args) {
        String[] str = new String[] { "a", "b" };

        A_89 a = null;

        // try catch是为了防止程序可能出现的异常
        // 按出现顺序，只捕获第一个出现的
        try {
            System.out.println(str[2]);
            System.out.println(a.i);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1.getMessage());
            e1.printStackTrace();
        } catch (NullPointerException e2) {
            System.out.println(e2.getMessage());
            e2.printStackTrace();
        }

        System.out.println("=====");
    }
}