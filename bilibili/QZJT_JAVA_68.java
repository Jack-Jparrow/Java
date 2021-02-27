/**
 * 模板设计模式
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-06 19:40:39
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-06 19:55:39
 */
abstract class Template {

    public abstract void code();

    public final void getTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();

        System.out.println("code方法执行时间 = " + (end - start));
    }
}

class testTemplate extends Template {

    @Override
    public void code() {
        double k = 0;
        for (int i = 0; i < 50000000; i++) {
            k += 1.9532356;
        }

        System.out.println(k);
    }
}

public class QZJT_JAVA_68 {

    public static void main(String[] args) {
        testTemplate t = new testTemplate();
        t.getTime();
    }
}

