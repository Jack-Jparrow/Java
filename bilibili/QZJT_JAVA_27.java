/**
 * 做一个Animal的类
 */
public class QZJT_JAVA_27 {

    String name;
    int eye;// 眼睛个数
    int legs;// 腿数量

    /**
     * 输出食物
     * 
     * @param food
     */
    public void eat(String food) {
        System.out.println("此动物食物是：" + food);
    }

    /**
     * 移动方式
     * 
     * @param moveType
     */
    public void move(String moveType) {
        System.out.println("此动物移动方式是：" + moveType);
    }

    public static void main(String[] args) {
        QZJT_JAVA_27 animal = new QZJT_JAVA_27();// 实例化对象

        animal.eye = 2;
        animal.legs = 4;
        animal.name = "tiger";
        System.out.println(animal.eye+ "" + animal.legs + animal.name);
        animal.move("walk");
        animal.eat("meat");
    }
}