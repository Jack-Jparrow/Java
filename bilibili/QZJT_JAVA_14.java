/**
 * for循环
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

        //从1到150循环，每行打印一个值
        //3的倍数打印“foo”
        //5的倍数打印“biz”
        //7的倍数打印“baz”
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
        
        //水仙花数
        for (int i = 100; i <= 999; i++) {
            int m = i / 100;
            int n = (i  - m * 100) / 10;
            int k = i - m * 100 - n * 10;

            if (m * m * m + n * n * n + k * k * k == i) {
                System.out.println(i);
            }
        }

        //1-100偶数和
        int res = 0;

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                res += i;
            }
        }

        System.out.println(res);

        //无限循环
        /* for (;;) {
            
        } */
    }
}