/**
 * Array�����������
 */
import java.util.Arrays;

class eg_3_16 {
    public static void main(String[] args) {
        int[] num = new int[10];
        
        for (int i = 0; i < 10; i++)// ����ǰ��
        {
            num[i] = (int) (Math.random() * 10) + 1; // ����1~10�����
            
            System.out.print(num[i] + "  ");// ��ӡ�����������
        }
        
        System.out.println("\n�����");
        
        Arrays.sort(num);// ����
        
        for (int i = 0; i < 10; i++){// �����
            System.out.print(num[i] + "  ");// ��ӡ��������
        }

        System.out.println();
        System.out.println("6��λ���ǣ�" + Arrays.binarySearch(num, 6));// ����6��λ��
    }
}
