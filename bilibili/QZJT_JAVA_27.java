/**
 * ��һ��Animal����
 */
public class QZJT_JAVA_27 {

    String name;
    int eye;// �۾�����
    int legs;// ������

    /**
     * ���ʳ��
     * 
     * @param food
     */
    public void eat(String food) {
        System.out.println("�˶���ʳ���ǣ�" + food);
    }

    /**
     * �ƶ���ʽ
     * 
     * @param moveType
     */
    public void move(String moveType) {
        System.out.println("�˶����ƶ���ʽ�ǣ�" + moveType);
    }

    public static void main(String[] args) {
        QZJT_JAVA_27 animal = new QZJT_JAVA_27();// ʵ��������

        animal.eye = 2;
        animal.legs = 4;
        animal.name = "tiger";
        System.out.println(animal.eye+ "" + animal.legs + animal.name);
        animal.move("walk");
        animal.eat("meat");
    }
}