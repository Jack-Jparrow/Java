/**
 * ��ʦ��ѧ����Ϣ
 */
public class QZJT_JAVA_28 {

    public String name;
    public int age;
    public String course;
    public String hobby;
    public int tecAge;
    public String profession;

    /***
     * ѧ��
     */
    public void student() {
        // QZJT_JAVA_28 student = new QZJT_JAVA_28();

        /*
         * student.name = "����"; student.age = 20; student.course = "Java"; student.hobby
         * = "noding";
         */

        System.out.println("��ѧ����");
        System.out.println("������" + name + " " + "���䣺" + age + " " + "�γ̣�" + course + " " + "��Ȥ��" + hobby);
    }

    /**
     * ��ʦ
     */
    public void teacher() {
        // QZJT_JAVA_28 teacher = new QZJT_JAVA_28();

        /*
         * teacher.name = "����"; teacher.profession = "Web"; teacher.course = "Java";
         * teacher.tecAge = 10;
         */

        System.out.println("����ʦ��");
        System.out.println("������" + name + " " + "רҵ��" + profession + " " + "���ڿγ̣�" + course + " " + "����" + tecAge);
    }

    public static void main(String[] args) {
        // QZJT_JAVA_28 o = new QZJT_JAVA_28();
        QZJT_JAVA_28 o1 = new QZJT_JAVA_28();
        QZJT_JAVA_28 o2 = new QZJT_JAVA_28();

        o1.name = "����";
        o1.age = 20;
        o1.course = "Java";
        o1.hobby = "coding";

        o2.name = "����";
        o2.profession = "Web";
        o2.course = "Java";
        o2.tecAge = 10;

        o1.student();
        o2.teacher();
    }
}