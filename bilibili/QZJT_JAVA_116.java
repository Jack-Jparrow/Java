/**
 * 用反射的构造方法创建对象
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-04 14:31:23
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-04 15:50:18
 */

public class QZJT_JAVA_116 {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("Student_116");// 通过包名.类名的字符串，调用class.forName方法获取指定类的Class实例

            try {
                Object obj = clazz.newInstance();// 当于调用student类的无参公有的构造方法
                Student_116 stu = (Student_116) obj;

                System.out.println(stu.school);
            } catch (InstantiationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // 通过包名.类名的字符串，调用class.forName方法获取指定类的Class实例
    }
}

class Person_116 {
    String name;
    int age;
}

class Student_116 extends Person_116 implements Move, Study {

    public Student_116() {
        System.out.println("调用的是public Student_116()");
    }

    public Student_116(String school) {
        this.school = school;

        System.out.println("调用的是public Student_116(String school)");
    }

    private Student_116(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("调用的是private Student_116(String name, int age)");
    }

    String school;

    void showInfo() {
        System.out.println("学校是：" + this.school);
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

}

interface Move {

    void moveType();
}

interface Study {

    void studyInfo();
}