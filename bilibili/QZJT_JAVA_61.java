/**
 * 单例设计模式——饿汉模式
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-05 18:52:14
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-05 19:10:49
 */
class Single {
    // 构造方法私有化，无法直接用new创建对象
    private Single() {

    }

    // 私有的single类型的类变量
    private static Single singles = new Single();

    public static Single getInstance() {
        return singles;

    }
}

public class QZJT_JAVA_61 {

    public static void main(String[] args) {

        // ↓这几个都指向上面的new Single()
        Single s0 = Single.getInstance();
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        Single s3 = Single.getInstance();
        Single s4 = Single.getInstance();
        Single s5 = Single.getInstance();
        // ↑

        for (int i = 0; i < 6; i++) {
            System.out.println(Single.getInstance());
        }
    }
}