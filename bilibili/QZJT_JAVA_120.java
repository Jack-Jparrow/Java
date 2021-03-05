import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;

/**
 * 反射机制调用指定方法
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-05 14:09:28
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-05 14:50:54
 */

public class QZJT_JAVA_120 {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("Student_120");

            // 使用newInstance新建对象
            /**
             * 注意:下面不论是反射调用setInfo还是test_120方法 都调用的obj对象的方法，obj对象实际上就是student_120对象
             */
            Constructor con = clazz.getConstructor();// 获取无参构造
            Object obj = con.newInstance();

            // Method m = clazz.getMethod("setInfo", String.class, String.class);// 得到名叫setInfo，参数是String, String的方法
            // 参数1是需要实例化的对象，后面的参数是调用当前的方法实际参数
            // m.invoke(obj, "张三", "一中");

            // 如果调用私有方法
            Method m2 = clazz.getDeclaredMethod("test_120", String.class);// 得到名叫test_120，参数是String的方法
            m2.setAccessible(true);// 解除私有封装
            m2.invoke(obj, "李四");

            // 调用重载方法
            Method m3 = clazz.getMethod("setInfo", int.class);// setInfo的重载方法
            m3.invoke(obj, 2);

            // 调用有返回值方法
            Method m4 = clazz.getMethod("getschool_120");// 方法名为sgetschool_120， 没有参数的方法
            String school = (String )m4.invoke(obj);// 调用有返回值但没有参数方法
            System.out.println(school);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Person_120 {
    String name;
    int age;
}

class Student_120 extends Person_120 implements Move_120, Study_120 {
    public Student_120() {

    }

    public Student_120(String school_120) {
        this.school_120 = school_120;
    }

    private Student_120(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String school_120;
    private String privateField;

    void showInfo() {
        System.out.println("学校是：" + this.school_120);
    }

    @Override
    public void Move_120Type() {
        // TODO Auto-generated method stub
        System.out.println("骑车上学");

    }

    @Override
    public void Study_120Info() {
        // TODO Auto-generated method stub
        System.out.println("学的是中学知识");

    }

    private void test_120(String name) {
        System.out.println("这是私有方法private void test_120(String name)");
    }

    public String getschool_120() {
        return this.school_120;
    }

    public void setInfo(int age) {
        System.out.println("这是public void setInfo(int age)方法");
    }

}

interface Move_120 {

    void Move_120Type();
}

interface Study_120 {

    void Study_120Info();
}