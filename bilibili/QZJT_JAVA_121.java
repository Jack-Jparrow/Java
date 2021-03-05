import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 反射机制调用指定属性
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-05 15:06:52
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-05 15:21:47
 */

public class QZJT_JAVA_121 {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("Student_121");

            // 反射创建一个对象
            Constructor con = clazz.getConstructor();
            Student_121 stu = (Student_121) con.newInstance();

            Field f = clazz.getField("school_121");// 获取名称为school_121的属性

            f.set(stu, "三中");// 对stu对象的school_121属性设置值
            String school = (String) f.get(stu);// 获取stu对象的school_121属性的值
            System.out.println(school);

            // 如果是私有属性
            Field f2 = clazz.getDeclaredField("privateField");
            f2.setAccessible(true);
            f2.set(stu, "测试私有属性");
            System.out.println(f2.get(stu));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Person_121 {
    String name;
    int age;
}

class Student_121 extends Person_121 implements Move_121, Study_121 {
    public Student_121() {

    }

    public Student_121(String school_121) {
        this.school_121 = school_121;
    }

    private Student_121(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String school_121;
    private String privateField;

    void showInfo() {
        System.out.println("学校是：" + this.school_121);
    }

    @Override
    public void Move_121Type() {
        // TODO Auto-generated method stub
        System.out.println("骑车上学");

    }

    @Override
    public void Study_121Info() {
        // TODO Auto-generated method stub
        System.out.println("学的是中学知识");

    }

    private void test_121(String name) {
        System.out.println("这是私有方法private void test_121(String name)");
    }

    public String getschool_121() {
        return this.school_121;
    }

    public void setInfo(int age) {
        System.out.println("这是public void setInfo(int age)方法");
    }

}

interface Move_121 {

    void Move_121Type();
}

interface Study_121 {

    void Study_121Info();
}