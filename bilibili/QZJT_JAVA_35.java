/**
 * �����Ĳ�������
 */

class DateSwap {
    public int a;
}

public class QZJT_JAVA_35 {

    public static void swap(DateSwap ds1) {
        ds1.a = 6;
        System.out.println("swap��" + ds1.a);
    }

    public static void main(String[] args) {
        DateSwap ds = new DateSwap();

        System.out.println("swapǰ" + ds.a);
        swap(ds);
        System.out.println("main��" + ds.a);
        /**
         * ds��ds1������ʵ������ͬһ������
         */
    }
}