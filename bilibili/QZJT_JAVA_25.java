/**
 * ����Ԫ�ص�����eg.ð������
 */
public class QZJT_JAVA_25 {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, -9, 0, 5, 7, 9, 56, 51, -66};
        int temp;

        // ��С������
        for (int i = 0; i < arr.length - 1; i++) {// ѭ���ִΣ����������鳤�� - 1
            for (int j = 0; j < arr.length - 1 - i; j++) {// ÿһ�ִ����ֶԱ�����
                if (arr[j] > arr[j + 1]) {// �˴���ͬ
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // �Ӵ�С��
        for (int i = 0; i < arr.length - 1; i++) {// ѭ���ִΣ����������鳤�� - 1
            for (int j = 0; j < arr.length - 1 - i; j++) {// ÿһ�ִ����ֶԱ�����
                if (arr[j] < arr[j + 1]) {// �˴���ͬ
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}