/**
 * 单例设计模式——懒汉模式
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-05 19:13:36
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-05 19:21:23
 */
class Single1 {

    // 先私有化构造方法，让外面不能直接new
    private Single1() {

    }

    public static Single1 s1 = null;

    public static Single1 getInstance() {
        if (s1 == null) {
            s1 = new Single1();
        }

        return s1;
    }
}

public class QZJT_JAVA_62 {

    public static void main(String[] args) {
        Single1 s1 = Single1.getInstance();
        // ↓都取s1的new Single1()
        Single1 s2 = Single1.getInstance();
        Single1 s3 = Single1.getInstance();
        Single1 s4 = Single1.getInstance();
        Single1 s5 = Single1.getInstance();
        Single1 s6 = Single1.getInstance();
        // ↑

        for (int i = 0; i < 7; i++) {
            System.out.println(Single1.getInstance());
        }
    }
}