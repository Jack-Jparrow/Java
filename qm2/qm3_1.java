import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 定义一个接口Aaa,其包含一个方法find(); 
 * 其下有三个类A1，A2，A3， 
 * A1:查找三个整型数的最大数 
 * A2：查找三个实型数的最小数
 * A3：查找一行字符中的单词数 
 * 定义一个主类H，通过输入对应的数据将三个类实例化，并实现对应的功能。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-15 18:57:26 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-15 19:08:56
 */

interface Aaa3_1{
    public void find();
}

class A13_1 implements Aaa3_1{
    Scanner s1 = new Scanner(System.in);

    @Override
    public void find() {
        System.out.print("请输入第一个数：");
        int a1 = s1.nextInt();
        System.out.print("请输入第二个数：");
        int b1 = s1.nextInt();
        System.out.print("请输入第三个数：");
        int c1 = s1.nextInt();

        System.out.println("三个整型数的最大数：" + (a1 > b1 ? (a1 > c1 ? a1 : c1) : (b1 > c1 ? b1 : c1)));

    }

}

class A23_1 implements Aaa3_1{
    Scanner s2 = new Scanner(System.in);

    @Override
    public void find() {
        System.out.print("请输入第一个数：");
        double a2 = s2.nextDouble();
        System.out.print("请输入第二个数：");
        double b2 = s2.nextDouble();
        System.out.print("请输入第三个数：");
        double c2 = s2.nextDouble();

        System.out.println("三个实型数的最小数：" + (a2 < b2 ? (a2 < c2 ? a2 : c2) : (b2 < c2 ? b2 : c2)));

    }
    
}

class A33_1 implements Aaa3_1{
    Scanner s3 = new Scanner(System.in);

    @Override
    public void find() {
        System.out.print("请输入一行字符：");
        String str = s3.nextLine();
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("一行字符中的单词数：" + st.countTokens());

    }
    
}

public class qm3_1 {

    public static void main(String[] args) {
        A13_1 x1 = new A13_1();
        A23_1 x2 = new A23_1();
        A33_1 x3 = new A33_1();
    
        x1.find();
        x2.find();
        x3.find();
    }
}