/**
 * 对学生成绩进行统计计算，
 * 参加考试的有6名学生，考试成绩分别为94.5,89.0,79.5,64.5,81.5,73.5，
 * 显示考试的总分和平均分，
 * 之后显示大于考试平均分的成绩信息。
 * 请写出实现上述功能的方法。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-13 18:39:15 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-14 21:00:58
 */

public class qm13 {

    public static void main(String[] args) {
        double[] a = {94.5, 89.0, 79.5, 64.5, 81.5, 73.5};
        double avg = 0.0;
        double sum = 0.0;
        
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            avg = sum / 6;
        }

        System.out.println("总分：" + sum);
        System.out.printf("平均分：%.2f", avg);
        System.out.println();

        System.out.print("成绩高于平均分的有：");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > avg) {
                System.out.print(a[i] + "   ");
            }
        }
    }
}