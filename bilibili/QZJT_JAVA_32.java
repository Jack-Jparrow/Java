/**
 * 方法的重载
 */
public class QZJT_JAVA_32 {

    public void max(int a, int b) {
        System.out.println(a > b ? a : b);
    }

    public void max(double a, double b) {
        System.out.println(a > b ? a : b);
    }

    public void max(double a, double b, double c) {
        System.out.println(a > b ? (a > c ? a : c) : (b > c ? b : c));
    }

    public static void main(String[] args) {
        QZJT_JAVA_32 o = new QZJT_JAVA_32();

        o.max(3, -9);
        o.max(3.5, 1.5);
        o.max(5.0, -8.5, 6.6);
    }
}