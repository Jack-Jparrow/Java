/**
 * 方法的重载
 */
public class QZJT_JAVA_31 {

    public void square(int a) {
        System.out.println(a * a);
    }

    public void square(int a, int b) {
        System.out.println(a * b);
    }

    public void square(String c) {
        System.out.println(c);
    }

    public static void main(String[] args) {
        QZJT_JAVA_31 o = new QZJT_JAVA_31();

        o.square(2);
        o.square(3, 4);
        o.square("hello");
    }
}