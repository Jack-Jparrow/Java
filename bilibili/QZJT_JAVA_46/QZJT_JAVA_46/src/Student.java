package QZJT_JAVA_46.QZJT_JAVA_46.src;

/**
 * 继承
 *
 * @Author: Jack Jparrow
 * @Date: 2020-11-30 21:20:33
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-02 07:09:46
 */
public class Student extends Person {

    String school;
    @Override
    public void showInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
        System.out.println(this.school);
    }
}