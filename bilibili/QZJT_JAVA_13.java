/**
 * ��֧�ṹswitch
 */
public class QZJT_JAVA_13 {

    public static void main(String[] args) {
        //�ж������Ǽ���������ڼ�
        int i = 2;
        String str = "Summer";

        switch (i) {
            case 1:
                System.out.println("����һ");
                break;
            case 2:
                System.out.println("���ڶ�");
                break;
            case 3:
                System.out.println("������");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("������");
                break;
            case 6:
                System.out.println("������");
                break;
            case 7:
                System.out.println("������");
                break;
            
            default:
                break;
        }

        switch (str) {
            case "Spring":
                System.out.println("����");
                break;
            case "Summer":
                System.out.println("����");
                break;
            case "Autumn":
                System.out.println("����");
                break;
            case "Winter":
                System.out.println("����");
                break;
        
            default:
                break;
        }

        //Сдa, b, c, d, eת��Ϊ��дA, B, C, D, E
        char c = 'a';
        // char c = 'b';
        // char c = 'c';
        // char c = 'd';
        // char c = 'e';

        switch (c) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
        
            default:
                break;
        }
    }
}