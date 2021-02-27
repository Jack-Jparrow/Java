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
 * @Date: 2020-12-16 17:34:27 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-16 17:57:17
 */

public class qm8_1 {

    public static void main(String[] args) {
        int[] x = new int[50];

        for (int i = 0; i < x.length; i++) {
            x[i] = 2 * i + 1;
            // System.out.print(x[i] + " ");
        }

        System.out.println("第一个数组：");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
            if (x[i] % 20 == 19) {
                System.out.println();
            }
        }

        char[][] y = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j || i + j == 9) {
                    y[i][j] = '*';
                }else{
                    y[i][j] = '#';
                }

                System.out.print(y[i][j] + "    ");
            }
            System.out.println();
        }
    }
}