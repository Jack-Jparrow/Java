import java.util.Arrays;
import java.util.Scanner;

/**
 * 根据主类，完成Compare类，
 * 该类有两个boolean类型的方法，
 * 方法isSameNum用来比较两组数是否完全相同，
 * 方法isSameSum用来比较两组数的和是否相等。
 * 相同或者相等返回true，否则返回false。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-14 19:26:46 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-16 19:37:32
 */

class Make{

    public int[] n1 = new int[20];
    public int[] n2 = new int[20];
    
    public void inputArr1() {
        Scanner s = new Scanner(System.in);
        System.out.print("第一组数的数据个数：");
        
        int a = s.nextInt();
        int[] n1 = new int[a];
        
        for (int i = 0; i < a; i++) {
            System.out.print("第" +(i + 1) + "个数：");
            n1[i] = s.nextInt();
        }
        
        System.out.print("第一组数是：");
        for (int i = 0; i < a; i++) {
            System.out.print(n1[i] + "  ");
        }
    }

    public void inputArr2() {
        Scanner s = new Scanner(System.in);
        System.out.print("第二组数的数据个数：");
        
        int a = s.nextInt();
        int[] n2 = new int[a];
        
        for (int i = 0; i < a; i++) {
            System.out.print("第" +(i + 1) + "个数：");
            n2[i] = s.nextInt();
        }
        
        System.out.print("第二组数是：");
        for (int i = 0; i < a; i++) {
            System.out.print(n2[i] + "  ");
        }
    }
}

class Compare{

    Make m = new Make();
    int sum1 = 0;
    int sum2 = 0;

    public void isSameNum() {
        System.out.println(Arrays.equals(m.n1, m.n2));
    }

    public void isSameSum() {
        for (int i = 0; i < m.n1.length; i++) {
            sum1 += m.n1[i];
        }
        for (int j = 0; j < m.n2.length; j++) {
            sum2 += m.n2[j];
        }

        System.out.println(sum1 == sum2);
    }
}

public class qm32 {

    public static void main(String[] args) {
        Make m = new Make();
        Compare c = new Compare();
        
        m.inputArr1();
        
        System.out.println();
        System.out.println();
        
        m.inputArr2();

        System.out.println();
        System.out.println();

        System.out.print("两组数是否完全相同：");
        c.isSameNum();

        System.out.println();

        System.out.print("两组数的和是否相等：");
        c.isSameSum();

    }
}