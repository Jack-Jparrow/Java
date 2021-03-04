import java.lang.reflect.Method;

/**
 * 反射机制获取类的方法
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-04 15:50:26
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-04 16:01:31
 */

public class QZJT_JAVA_117 {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("Student_117");

            Method[] ms = clazz.getMethods();// 获取到类的所有公有的方法

            for (Method m : ms) {
                System.out.println("方法名：" + m.getName());
                System.out.println("返回值类型：" + m.getReturnType());
                System.out.println("修饰符：" + m.getModifiers());

                Class[] pcs = m.getParameterTypes();// 获取方法的参数类型，是一个数组，方法有几个梦数，数据就有几个
                if (pcs != null && pcs.length > 0) {
                    for (Class pc : pcs) {
                        System.out.println("参数类型是：" + pc.getName());
                    }
                }

                System.out.println("------------------------");
            }

            Method[] ms1 = clazz.getDeclaredMethods();// 获取到类的所有的方法

            for (Method m1 : ms1) {
                System.out.println("方法名：" + m1.getName());
                System.out.println("返回值类型：" + m1.getReturnType());
                System.out.println("修饰符：" + m1.getModifiers());

                Class[] pcs1 = m1.getParameterTypes();// 获取方法的参数类型，是一个数组，方法有几个梦数，数据就有几个
                if (pcs1 != null && pcs1.length > 0) {
                    for (Class pc1 : pcs1) {
                        System.out.println("参数类型是：" + pc1.getName());
                    }
                }

                System.out.println("------------------------");
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Person_117 {
    String name;
    int age;
}

class Student_117 extends Person_117 implements Move, Study {
    public Student_117() {

    }

    public Student_117(String school) {
        this.school = school;
    }

    private Student_117(String name, int age) {
        this.name = name;
        this.age = age;
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

    private void test_117(String name) {

    }

    public String getSchool() {
        return this.school;
    }

}

interface Move {

    void moveType();
}

interface Study {

    void studyInfo();
}