/**
 * 按要求编写Java应用程序。
 * 编写一个名为Test的主类，类中只有一个主方法；
 * 在主方法中定义一个大小为50的一维整型数组，
 * 数组名为x，数组中存放着｛1，3，5，……，99｝
 * 输出这个数组中的所有元素，每输出十个换一行；
 * 在主方法中定义一个大小为10*10的二维字符型数组，数组名为y，正反对角线上存的是“*",其余位置存的是”#“；
 * 输出这个数组中的所有元素。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-13 15:02:43 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-13 17:00:16
 */

public class qm8 {

    public static void main(String[] args) {
        int[] x = new int[50];
        char[][] y = new char[10][10];
        int j = 1;

        for (int i = 0; i < 50; i++) {
            x[i] = j;
            j += 2;
        }
        System.out.println("数组x：");
        for (int i = 0; i < 50; i++) {
            System.out.print(x[i] + "   ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }

        System.out.println("数组y：");
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (i == k || i + k == 9) {
                    y[i][k] = '*';
                }else{
                    y[i][k] = '#';
                }
                System.out.print(y[i][k] + "  ");
            }
            System.out.println();
        }
    }
}
