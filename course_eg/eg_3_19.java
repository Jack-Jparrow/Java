/**
 * ���鸴��
 */
class eg_3_19 { // ���������ʼ������
    static byte a[] = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74 };
    static byte b[] = new byte[a.length];// �����������飬��С����a�ĳ���

    public static void main(String args[]) {
        System.out.println("a = " + new String(a));
        System.arraycopy(a, 0, b, 0, a.length);// ���ø�������ķ���
        System.out.println("b = " + new String(b));
    }
}
