/**
 * ��ȡ�ַ���
 */
class eg_3_12 {
    public static void main(String args[]) {
        String s = "This is a getChars method.";
        int start = 10;// ��һ���ַ���λ�ã�������Ϊ0��10�����11���ַ�λ��
        int end = 18;// ��19���ַ�λ��
        char buf[] = new char[end - start];
        
        s.getChars(start, end, buf, 0);
        
        System.out.println(buf);
    }
}
