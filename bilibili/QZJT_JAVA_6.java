/**
 * ��ֵ�����
 */
public class QZJT_JAVA_6 {

    public static void main(String[] args) {
        int i = 1;
        short s = 2;
        int i0 = 0;
        int i1 = 0;
        int i2 = 0;
        String str = "hello";

        str += " 1121";//�ַ���+=�����ַ���ƴ��

        i1 = i2 = i0 = 1;//������ֵ

        i = s;//�Զ�����ת��
        s = (short)i;//ǿ������ת��

        System.out.println(i + ", " + s + ", " + i0 + ", " + i1 + ", " + i2);
        System.out.println(str);

    }
}