package QZJT_JAVA_36.src;

/**
 * ��װ������
 */
public class person {

    private int age;// �����������������Կ��ţ�������ʹ��
    //�����ֲ�������ʹ�õ�������Ҫ��װ�����أ��ĳ�private

    int age2;
/*     public void printAge() {

        System.out.println(age);
    } */
    public int getAge() {
        System.out.println(age);
        System.out.println(age2);
        return age;
    }

    public void setAge(int a) {
        if (a >= 0 && a <=150) {
            age = a;
            age2 = a;
        }else{
            System.out.println(a + " illegal");
        }
    }
}