/**
 * ����������ѧ����Ϣ��ͳ��ƽ���ɼ�
 */
public class eg_3_7 {

    public static void main(String[] args) {
        int[] score = { 72, 89, 65, 58, 87, 91, 53, 82, 71, 93, 76, 68 };// ��������ͳ�ʼ��
        float average = 0.0f;// ���ֺͣ������ƽ��ֵ

        for (int i = 0; i < score.length; i++) {
            average += score[i];// �ɼ��ۼӺͣ����ֺͣ�
        }

        average /= score.length;// ��ƽ��

        System.out.println("average = " + average);
    }
}