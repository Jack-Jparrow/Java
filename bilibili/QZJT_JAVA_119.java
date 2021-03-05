/**
 * 反射机制获取类所在的包
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-05 10:21:32
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-05 14:22:19
 */

public class QZJT_JAVA_119 {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("Student_118");

            Package p = clazz.getPackage();
            
            System.out.println(p.getName());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Person_119 {
    String name;
    int age;
}

class Student_119 extends Person_119 implements Move, Study {
    public Student_119() {

    }

    public Student_119(String school_119) {
        this.school_119 = school_119;
    }

    private Student_119(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String school_119;
    private String privateField;

    void showInfo() {
        System.out.println("学校是：" + this.school_119);
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

    private void test_119(String name) {

    }

    public String getschool_119() {
        return this.school_119;
    }

}

interface Move {

    void moveType();
}

interface Study {

    void studyInfo();
}