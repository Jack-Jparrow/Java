/**
 * forѭ��
 */
public class QZJT_JAVA_14 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
        
        int result = 0;

        for (int i = 1; i <= 100; i++) {
            result += i;
        }

        System.out.println(result);

        //��1��150ѭ����ÿ�д�ӡһ��ֵ
        //3�ı�����ӡ��foo��
        //5�ı�����ӡ��biz��
        //7�ı�����ӡ��baz��
        for (int i = 1; i < 151; i++) {
            String str = "";
            str += i;
            if (i % 3 == 0) {
                str += " foo";
            }
            if (i % 5 == 0) {
                str += " biz";
            }
            if (i % 7 == 0) {
                str += " baz";
            }

            System.out.println(str);
        }
        
        //ˮ�ɻ���
        for (int i = 100; i <= 999; i++) {
            int m = i / 100;
            int n = (i  - m * 100) / 10;
            int k = i - m * 100 - n * 10;

            if (m * m * m + n * n * n + k * k * k == i) {
                System.out.println(i);
            }
        }

        //1-100ż����
        int res = 0;

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                res += i;
            }
        }

        System.out.println(res);

        //����ѭ��
        /* for (;;) {
            
        } */
    }
}