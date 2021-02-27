/**
 * 利用数组存放学生信息，统计平均成绩
 */
public class eg_3_7 {

    public static void main(String[] args) {
        int[] score = { 72, 89, 65, 58, 87, 91, 53, 82, 71, 93, 76, 68 };// 声明定义和初始化
        float average = 0.0f;// 部分和，最后存放平均值

        for (int i = 0; i < score.length; i++) {
            average += score[i];// 成绩累加和（部分和）
        }

        average /= score.length;// 求平均

        System.out.println("average = " + average);
    }
}