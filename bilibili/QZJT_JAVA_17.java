/**
 *嵌套循环
 */
public class QZJT_JAVA_17 {

    public static void main(String[] args) {
        //九九乘法表
        int a = 0;
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                a = i * j;
                
                if (a < 10 && i < 5 && j > 1) {
                    System.out.print(j + "*" + i + "=" + a + "  ");
                }else{
                    System.out.print(j + "*" + i + "=" + a + " ");
                }
            }

            System.out.println();
        }

        //1-100所有质数
        for (int i = 1; i <= 100; i++) {
            int k = 0;//整除的次数

            for (int j = 1; j <= i; j++) {//循环1到i，用i与1到i之间的数分别取模
                if (i % j == 0) {
                    k++;
                }
            }
            
            if (k == 2) {//如果循环次数为2，当前大循环的i就是质数
                System.out.println(i);
            }
        }
    }
}