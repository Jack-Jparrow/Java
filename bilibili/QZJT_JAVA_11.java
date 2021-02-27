/**
 * 获取两个数中较大的一个
 * 获取三个数中较大的一个
 */
public class QZJT_JAVA_11 {

    public static void main(String[] args) {
        int m = 1;
        int n = 2;
        int k = 3;

        System.out.println(m > n ? m : n);
        //三目运算符嵌套
        System.out.println(m > n ? (m > k ? m : k) : (n > k ? n : k));
    }
}