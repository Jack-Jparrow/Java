/**
 * ��֧�ṹif...else
 */
public class QZJT_JAVA_12 {

    public static void main(String[] args) {
        int i = 1;

        if (i != 1) {
            System.out.println(1);
        }
        
        //�ж���ż��
        if (i % 2 == 0) {
            System.out.println("ż��");
        }else{
            System.out.println("����");
        }
        
        //�ж������Ǽ���������ڼ�
        if (i == 1) {
            System.out.println("����һ");
        }else if (i == 2) {
            System.out.println("���ڶ�");
        }else if (i == 3) {
            System.out.println("������");
        }else if (i == 4) {
            System.out.println("������");
        }else if (i == 5) {
            System.out.println("������");
        }else if (i == 6) {
            System.out.println("������");
        }else if (i == 7) {
            System.out.println("������");
        }else{
            System.out.println("��֪��");
        }

    }
}