/**
 * ��Java���滻�ɡ�This is Turbo C��
 */
class Replace {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Java programming!");
        sb.replace(0, 4, "This is Turbo C");// ��һ���ַ�λ��Ϊ0
        System.out.println("After replace: " + sb.toString());
        // Ҳ��ʹ������ķ���
        // sb=sb.replace(0, 4, "This is Turbo C");
        // System.out.println("After replace: " + sb);
    }
}
