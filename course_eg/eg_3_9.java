/**
 * ABC三个矩阵相乘，结果放入C
 */
public class eg_3_9 {
    public static void main(String[] args) {
        float[][] B = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };// 声明并初始化二维数组B
        float[][] A = { { 1, 2, 3 }, { 4, 5, 6 } };// 声明并初始化二维数组A
        float[][] C = new float[2][3];// 声明并初始化二维数组A
        int i, j, k;

        for (i = 0; i < 2; i++) {// 控制C中的行数
            for (j = 0; j < 3; j++) {// 控制C中的列数
                for (k = 0; k < 3; k++) {
                    C[i][j] = A[i][k] * B[k][j];// 计算C中的每个元素
                }

                System.out.print(C[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
