/**
 * 方法的参数传递
 */

class DateSwap {
    public int a;
}

public class QZJT_JAVA_35 {

    public static void swap(DateSwap ds1) {
        ds1.a = 6;
        System.out.println("swap中" + ds1.a);
    }

    public static void main(String[] args) {
        DateSwap ds = new DateSwap();

        System.out.println("swap前" + ds.a);
        swap(ds);
        System.out.println("main中" + ds.a);
        /**
         * ds和ds1操作的实际上是同一个对象
         */
    }
}