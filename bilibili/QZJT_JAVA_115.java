import java.lang.reflect.Constructor;

/**
 * 反射获取一个类的构造器的方法
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-04 10:01:44
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-04 15:59:40
 */

public class QZJT_JAVA_115 {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("Student_115");
            Constructor[] cons = clazz.getConstructors();// 获取类公有的构造方法

            for (Constructor c : cons) {
                System.out.println("------------------");

                System.out.println("构造方法名称：" + c.getName());// 获取方法名称
                // 获取方法修饰符，返回数字1代表public
                System.out.println("构造方法的修饰符：" + c.getModifiers());

                Class[] paramClazz = c.getParameterTypes();// 获取构造方法的参数类型，有几个参数，数组的元素就有几个
                for (Class pc : paramClazz) {
                    System.out.println("构造方法" + c.getName() + "的类型：" + pc.getName());
                }

                System.out.println("------------------");
            }

            Constructor[] cons1 = clazz.getDeclaredConstructors();// 获取类的所有的造方法，包括公有和私有的
            for (Constructor c : cons1) {
                System.out.println("------------------");

                System.out.println("构造方法名称：" + c.getName());// 获取方法名称
                // 获取方法修饰符，返回数字2代表private
                System.out.println("构造方法的修饰符：" + c.getModifiers());

                Class[] paramClazz2 = c.getParameterTypes();// 获取构造方法的参数类型，有几个参数，数组的元素就有几个
                for (Class pc : paramClazz2) {
                    System.out.println("构造方法" + c.getName() + "的类型：" + pc.getName());
                }

                System.out.println("------------------");
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // 通过包名.类名的字符串，调用class.forName方法获取指定类的Class实例

    }
}

class Person_115 {
    String name;
    int age;
}

class Student_115 extends Person_115 implements Move, Study {
    public Student_115() {

    }

    public Student_115(String school) {
        this.school = school;
    }

    private Student_115(String name, int age) {
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

}

interface Move {

    void moveType();
}

interface Study {

    void studyInfo();
}