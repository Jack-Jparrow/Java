/**
 * �ɱ�����Ĳ���
 */
public class QZJT_JAVA_33 {
    /**
     * �����鴫�ݿɱ�����Ĳ���
     * 
     * @param args
     */
    public void printInfo(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
        }
    }

    /**
     * ��Java���е�...��ʽ���ݿɱ�����Ĳ������������ʹ�÷�ʽ��ͬ 
     * ���û�в����Ϳ��Բ���
     * ����...������Դ���0���������
     * @param args
     */
    public void printInfo1(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
        }
    }

    public static void main(String[] args) {
        QZJT_JAVA_33 o = new QZJT_JAVA_33();

        String[] arg = new String[] { "zhangsan", "11" };
        o.printInfo(arg);
        String[] arg1 = new String[] { "ƽ����", "13812345678" };
        o.printInfo(arg1);

        System.out.println();

        String[] arg2 = new String[] { "zhangsan", "11" };
        o.printInfo1(arg2);
        String[] arg3 = new String[] { "ƽ����", "13812345678" };
        o.printInfo1(arg3);
    }
}