public class QZJT_JAVA_3 {
    public static void main(String[] args) {
        int i = 3;
        short j = 2;// 先转换成int
        byte k = 1;// 先转换成int
        String str0 = "hello";

        System.out.println(i + j + k);// 结果是int
        System.out.println(str0 + i + j + k);
        System.out.println(3 + 2 + 1 + str0);
        System.out.println(str0 + 3 + 2 + 1);
        System.out.println('a' + " " + 3 + 2 + 1 + "hello");
        System.out.println("hello " + 'w' + 'o'+ 'r'+ 'd' +" " + 3 + 2 + 1);
    }
}