/**
 * 方法的重载
 */
public class QZJT_JAVA_30 {

    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public double add(int x, double y) {
        return x + y;
    }

    public double add(double m, int y) {
        return m + y;
    }

    public int add(int m, int y, int z) {
        return m + y + z;
    }

    public static void main(String[] args) {
        QZJT_JAVA_30 o = new QZJT_JAVA_30();

        int a = o.add(3, 2);
        double b = o.add(3.2d, 2.2d);
        double c = o.add(3, 2.4d);
        double d = o.add(3.29d, 2.25);
        int e = o.add(4, 2, 5);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}