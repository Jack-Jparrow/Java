/**
 * 对学生成绩进行统计计算，
 * 参加考试的有6名学生，考试成绩分别为94.5,89.0,79.5,64.5,81.5,73.5，
 * 显示考试的总分和平均分，
 * 之后显示大于考试平均分的成绩信息。
 * 请写出实现上述功能的方法。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 19:12:54 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-20 20:04:03
 */

public class qm13_1 {

    public static void main(String[] args) {
        double[] a = {94.5, 89.0, 79.5, 64.5, 81.5, 73.5};

        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double avg = sum / 6;

        System.out.println("总分：" + sum);
        System.out.printf("平均分：%.2f%n", avg);

        System.out.print("大于考试平均分的成绩：");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > avg) {
                System.out.print(a[i] + "   ");
            }
        }
    }
}