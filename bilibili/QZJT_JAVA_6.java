/**
 * 赋值运算符
 */
public class QZJT_JAVA_6 {

    public static void main(String[] args) {
        int i = 1;
        short s = 2;
        int i0 = 0;
        int i1 = 0;
        int i2 = 0;
        String str = "hello";

        str += " 1121";//字符串+=就是字符串拼接

        i1 = i2 = i0 = 1;//连续赋值

        i = s;//自动类型转换
        s = (short)i;//强制类型转换

        System.out.println(i + ", " + s + ", " + i0 + ", " + i1 + ", " + i2);
        System.out.println(str);

    }
}