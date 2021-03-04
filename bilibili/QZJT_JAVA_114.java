/**
 * 通过反射调用类的完整结构
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-03 15:30:26
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-04 10:08:43
 */

public class QZJT_JAVA_114 {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("Student_114");// 通过包名.类名的字符串，调用class.forName方法获取指定类的Class实例

            Class superClass = clazz.getSuperclass();// 获取父类
            System.out.println("父类：" + superClass.getName());

            Class[] interfaces = clazz.getInterfaces();// 获取当前类的所有接口
            for (Class c : interfaces) {
                System.out.println("接口：" + c.getName());
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Person_114 {
    String name;
    int age;
}

class Student_114 extends Person_114 implements Move, Study {

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