/**
 * ����ϵͳ���������
 */
public class eg_3_21 {
    public static void main(String args[]) {

        String strProperty = System.getProperty("java.io.tmpdir");
        System.out.println("ԭ������ʱ�ļ��洢Ŀ¼���ƣ�" + strProperty);
        System.out.println("����ʱ�ļ�Ŀ¼����ΪC:/Tmp");
        String oldProperty = System.setProperty("java.io.tmpdir", "C:/Tmp");
        
        strProperty = System.getProperty("java.io.tmpdir");
        
        System.out.println("���ú����ʱ�ļ��洢Ŀ¼���ƣ�" + strProperty);
    }
}
