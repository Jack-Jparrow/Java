/**
 * 构造器
 * 
 * @Author: Jack Jparrow
 * @Date: 2020-11-25 15:40:09
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-11-25 20:08:15
 */
public class QZJT_JAVA_39 {
    /**
     * 如果显示地定义了构造方法，则不会使用默认构造方法
     */
    public QZJT_JAVA_39(int a, String n) {
        age = a;
        name = n;
    }

    public int age;
    public String name;

    public void showInfo() {
        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args) {
        QZJT_JAVA_39 person = new QZJT_JAVA_39(20, "李四");
        person.showInfo();
    }
}