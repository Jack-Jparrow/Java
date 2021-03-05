import java.lang.reflect.Field;

/**
 * 反射机制获取类的属性
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-05 10:06:10
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-05 10:20:41
 */

public class QZJT_JAVA_118 {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("Student_118");

            Field[] fs = clazz.getFields();// 获取类的公有属性，包括父类

            for (Field f : fs) {
                System.out.println("修饰符：" + f.getModifiers());
                System.out.println("属性类型：" + f.getType());
                System.out.println("属性名称：" + f.getName());
                System.out.println("-------------------------");
            }

            Field[] fs2 = clazz.getDeclaredFields();// 获取类的所有属性，不包括父类

            for (Field f2 : fs2) {
                // System.out.println("-------------------------");
                System.out.println("修饰符：" + f2.getModifiers());
                System.out.println("属性类型：" + f2.getType());
                System.out.println("属性名称：" + f2.getName());
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Person_118 {
    String name;
    int age;
}

class Student_118 extends Person_118 implements Move, Study {
    public Student_118() {

    }

    public Student_118(String school_118) {
        this.school_118 = school_118;
    }

    private Student_118(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String school_118;
    private String privateField;

    void showInfo() {
        System.out.println("学校是：" + this.school_118);
    }

    @Override
    public void moveType() {
        // TODO Auto-generated method stub
        System.out.println("骑车上学");

    }

    @Override
    public void studyInfo() {
        // TODO Auto-generated method stub
        System.out.println("学的是中学知识");

    }

    private void test_118(String name) {

    }

    public String getschool_118() {
        return this.school_118;
    }

}

interface Move {

    void moveType();
}

interface Study {

    void studyInfo();
}