/**
 * 可变个数的参数
 */
public class QZJT_JAVA_33 {
    /**
     * 用数组传递可变个数的参数
     * 
     * @param args
     */
    public void printInfo(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
        }
    }

    /**
     * 用Java特有的...方式传递可变个数的参数，与数组的使用方式相同 
     * 如果没有参数就可以不填
     * 这种...代表可以传递0到多个参数
     * @param args
     */
    public void printInfo1(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
        }
    }

    public static void main(String[] args) {
        QZJT_JAVA_33 o = new QZJT_JAVA_33();

        String[] arg = new String[] { "zhangsan", "11" };
        o.printInfo(arg);
        String[] arg1 = new String[] { "平安街", "13812345678" };
        o.printInfo(arg1);

        System.out.println();

        String[] arg2 = new String[] { "zhangsan", "11" };
        o.printInfo1(arg2);
        String[] arg3 = new String[] { "平安街", "13812345678" };
        o.printInfo1(arg3);
    }
}