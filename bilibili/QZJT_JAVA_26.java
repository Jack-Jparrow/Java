/**
 * ��һ��Person����
 */
public class QZJT_JAVA_26 {
    // ���ԣ���Ա����
    String name;// StringĬ��Ϊnull
    int age;// intĬ��Ϊ0

    // ��Ϊ������������
    /**
     * �������
     */
    public void showName() {
        System.out.println(name);
    }

    /**
     * ��ȡ����
     * 
     * @return
     */
    public int getAge() {// �����һ���з���ֵ�ķ�������ô���������һ��һ���Ƿ�����Ӧ�����ݣ���return
        return age;
    }

    public static void main(String[] args) {
        // ʵ����Person/����Person����
        QZJT_JAVA_26 person = /* ʵ������ */new QZJT_JAVA_26()/* �� */;// ����һ��QZJT_JAVA_26�ࣨPerson�ࣩ��������person��ʵ��������ֵ��ֵΪ��ǰ��ʵ����
        
        person.name = "����";// ��person�����name���Ը�ֵ
        person.age = 10;
        person.showName();// ���󷽷��ĵ���

        int i = person.getAge();// �з���ֵ�ķ������ڵ���֮����һ��ֵ�����ֵ���Ƿ�����return�Ĳ���
        System.out.println(i);
    }
}