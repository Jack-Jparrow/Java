/**
 * 抛出异常
 *
 * @Author: Jack Jparrow
 * @Date: 2021-01-17 15:44:57
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-01-17 15:55:39
 */
class B_90 {
    int i;

    public void test_90() throws Exception {// 可以使用throws在代码中抛出异常，在调用方去捕获处理
        B_90 b = null;
        System.out.println(b.i);
    }
}

public class QZJT_JAVA_90 {

    public static void main(String[] args) {// 可以在main方法继续抛出异常
        // main方法抛出异常直接抛到虚拟机上去，在程序中不能处理
        B_90 b = new B_90();
        try {// throws在代码中抛出的异常，再调用方去捕获处理
            b.test_90();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}