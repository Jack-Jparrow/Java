/**
 * �Ƚ��ַ���
 */
class eg_3_11 {
    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";
        
        System.out.println(s1 + " equals " + s2 + ": " + s1.equals(s2));// true
        System.out.println(s1 + " equals " + s3 + " : " + s1.equals(s3));// false
        System.out.println(s1 + " equals " + s4 + " : " + s1.equals(s4));// false
        System.out.println(s1 + " equalsIgnoreCase " + s4 + ": " + s1.equalsIgnoreCase(s4));// true�����Դ�Сд
        System.out.println(s1 + " == " + s2 + ": " + (s1 == s2));// false��==Ϊ����Ƚϣ�
    }// s1��s2����һ����������2����ȡ�
}
