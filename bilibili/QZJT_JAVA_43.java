/**
 * 关键字this
 *
 * @Author: Jack Jparrow
 * @Date: 2020-11-26 07:12:33
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-11-26 09:08:04
 */

public class QZJT_JAVA_43 {
    public QZJT_JAVA_43(int age, String name) {
        this(18);// 等同于调用public QZJT_JAVA_43(int age)
        this.age/* 代表外面定义的age */ = age;
        this.name/* 代表外面定义的name */ = name;
    }

    public QZJT_JAVA_43() {

    }

    public QZJT_JAVA_43(int age) {
        this.age = age;
    }

    public QZJT_JAVA_43(String name) {
        this();// ==public QZJT_JAVA_43();
        this.name = name;
    }

    int age;
    String name;

    public void setName(String name) {
        this.name/* 代表外面定义的name */ = name;
    }

    public void setName1(String name) {
        this.setName(name);// 调用上面的方法，将此方法的参数传过去
    }

    public void showInfo() {
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
    }

    public static void main(String[] args) {
        QZJT_JAVA_43 person = new QZJT_JAVA_43(20, "张三");
        person.showInfo();
    }

}
