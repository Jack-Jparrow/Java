import java.util.*;

/**
 * 定义一个接口Aaa,其包含一个方法find(); 
 * 其下有三个类A1，A2，A3， 
 * A1:查找三个整型数的最大数 
 * A2：查找三个实型数的最小数
 * A3：查找一行字符中的单词数 
 * 定义一个主类H，通过输入对应的数据将三个类实例化，并实现对应的功能。
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-12 07:57:32
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-12 08:22:23
 */
interface Aaa {

    public void find();
}

class A1 implements Aaa {

    @Override
    public void find() {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        int b = s1.nextInt();
        int c = s1.nextInt();

        System.out.println(a > b ? (a > c ? a : c) : (b > c ? b : c));
    }

}

class A2 implements Aaa {

    @Override
    public void find() {
        Scanner s2 = new Scanner(System.in);
        double a = s2.nextDouble();
        double b = s2.nextDouble();
        double c = s2.nextDouble();

        System.out.println(a < b ? (a < c ? a : c) : (b < c ? b : c));
    }

}

class A3 implements Aaa {

    @Override
    public void find() {
        Scanner s3 = new Scanner(System.in);
        String str = s3.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.countTokens());
    }

}

public class qm3 {

    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.find();

        A2 a2 = new A2();
        a2.find();

        A3 a3 = new A3();
        a3.find();
    }
}