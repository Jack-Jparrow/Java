/**
 * 对学生成绩进行统计计算，参加考试的有6名学生，
 * 考试成绩分别为94.5,89.0,79.5,64.5,81.5,73.5，
 * 显示考试的总分和平均分，
 * 之后显示大于考试平均分的成绩信息。
 * 请写出实现上述功能的方法。
 *  public class Sum {
 *      public static void main(String[] args) {
 *          System.out.println("计算本组成员的考试总分数");
 *          float a[] = { 94.5f, 89.0f, 79.5f, 64.5f, 81.5f, 73.5f };
 *          visitAllArray(a); // 遍历数组打印每一个元素
 *          float totalscore = calculate(a); // 计算数组数据数值的总和
 *          System.out.println("考试总分数:" + totalscore + "平均分:" + totalscore/ a.length);
 *          System.out.print("高于平均分的是:");
 *          visitAllArray(getHighScore(a)); // 方法getHighScore的作用是将大于考试平均分的成绩存入数组，作为返回值
 *      }
 *  }
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-20 21:14:44 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-21 06:50:06
 */

public class Sum {

    
    public static void main(String[] args) {
        System.out.println("计算本组成员的考试总分数");
        float a[] = { 94.5f, 89.0f, 79.5f, 64.5f, 81.5f, 73.5f };
        visitAllArray(a); // 遍历数组打印每一个元素
        float totalscore = calculate(a); // 计算数组数据数值的总和
        System.out.println("考试总分数:" + totalscore + "平均分:" + totalscore / a.length);
        System.out.print("高于平均分的是:");
        visitAllArray(getHighScore(a)); // 方法getHighScore的作用是将大于考试平均分的成绩存入数组，作为返回值

        
    }

    private static float[] getHighScore(float[] a) {
        float totalscore = calculate(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > (totalscore / a.length)) {
                count++;
            }
        }

        float[] b = new float[count];
        count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > (totalscore / a.length)) {
                b[count] = a[i];
                count++;
            }
        }
        return b;
    }

    private static float calculate(float[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    private static void visitAllArray(float[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "   ");
        }
        System.out.println();
    }


}