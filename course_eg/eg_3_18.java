/**
 * �˳�����ķ���
 */
public class eg_3_18 {
    public static void main(String args[]) {
        // �������д��룬���ݴ����������������߼����͵�״ֵ̬
        int b = 1;
        
        if (args.length > 0)
            b = Integer.parseInt(args[0]);// �����д�һ������
        if (b == 0) {
            System.out.println("Ӧ�ó�����������");
            System.exit(b);
        } else {
            // �쳣�˳�
            System.out.println("Ӧ�ó����쳣����");
            System.exit(b);
        }
    }
}
