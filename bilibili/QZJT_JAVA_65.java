/**
 * 关键字final
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-06 09:53:27
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-06 18:27:59
 */
public class QZJT_JAVA_65 {
    int age;
    final static String NAME = "张三";

    public void test() {

    }
}

class T0 extends QZJT_JAVA_65 {

    @Override
    public void test() {
        // TODO Auto-generated method stub
        super.test();
    }

    public static void main(String[] args) {
        final int i = 0;
        // i = 11;
    }
    
}
