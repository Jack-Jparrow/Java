package QZJT_JAVA_46.QZJT_JAVA_46.src;

/**
 * 继承
 *
 * @Author: Jack Jparrow
 * @Date: 2020-11-30 21:12:22
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-02 07:09:03
 */
public class Person {
    int age;
    String name;
    String sex;

    public void showInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
    }

}