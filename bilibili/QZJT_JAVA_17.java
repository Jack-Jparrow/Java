/**
 *Ƕ��ѭ��
 */
public class QZJT_JAVA_17 {

    public static void main(String[] args) {
        //�žų˷���
        int a = 0;
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                a = i * j;
                
                if (a < 10 && i < 5 && j > 1) {
                    System.out.print(j + "*" + i + "=" + a + "  ");
                }else{
                    System.out.print(j + "*" + i + "=" + a + " ");
                }
            }

            System.out.println();
        }

        //1-100��������
        for (int i = 1; i <= 100; i++) {
            int k = 0;//�����Ĵ���

            for (int j = 1; j <= i; j++) {//ѭ��1��i����i��1��i֮������ֱ�ȡģ
                if (i % j == 0) {
                    k++;
                }
            }
            
            if (k == 2) {//���ѭ������Ϊ2����ǰ��ѭ����i��������
                System.out.println(i);
            }
        }
    }
}