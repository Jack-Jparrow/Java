/**
 * ABC����������ˣ��������C
 */
public class eg_3_9 {
    public static void main(String[] args) {
        float[][] B = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };// ��������ʼ����ά����B
        float[][] A = { { 1, 2, 3 }, { 4, 5, 6 } };// ��������ʼ����ά����A
        float[][] C = new float[2][3];// ��������ʼ����ά����A
        int i, j, k;

        for (i = 0; i < 2; i++) {// ����C�е�����
            for (j = 0; j < 3; j++) {// ����C�е�����
                for (k = 0; k < 3; k++) {
                    C[i][j] = A[i][k] * B[k][j];// ����C�е�ÿ��Ԫ��
                }

                System.out.print(C[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
