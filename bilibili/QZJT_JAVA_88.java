/**
 * 捕获异常
 *
 * @Author: Jack Jparrow
 * @Date: 2021-01-16 16:05:01
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-01-17 15:17:38
 */
public class QZJT_JAVA_88 {

    public static void main(String[] args) {
        int i = 0;

        try {// 用try{}括住可能出现异常的代码段
            System.out.println(1);
            System.out.println(3 / i);
            System.out.println(2);
        } catch (Exception e/* 所有异常的父类，当不知道捕获的是什么类型的异常时用 */) {// 捕获异常
            System.out.println(3);
            e.printStackTrace();// 输出异常类型
            System.out.println(e.getMessage());// 输出异常信息
        } finally {// 可写可不写
            System.out.println(4);
        }
        System.out.println("OK");
    }
}