/**
 * ��ȡ�������нϴ��һ��
 * ��ȡ�������нϴ��һ��
 */
public class QZJT_JAVA_11 {

    public static void main(String[] args) {
        int m = 1;
        int n = 2;
        int k = 3;

        System.out.println(m > n ? m : n);
        //��Ŀ�����Ƕ��
        System.out.println(m > n ? (m > k ? m : k) : (n > k ? n : k));
    }
}