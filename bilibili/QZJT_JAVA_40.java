/**
 * person加构造器给age赋初值，每次创建对象都初始化
 * 
 * @Author: Jack Jparrow
 * @Date: 2020-11-25 19:40:38
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-11-25 20:08:04
 */
public class QZJT_JAVA_40 {

    String name;
    int age;

    public QZJT_JAVA_40(int a, String n) {
        age = a;
        name = n;
    }

    public static void main(String[] args) {
        QZJT_JAVA_40 person = new QZJT_JAVA_40(18, "张三");
        System.out.println(person.age);
        System.out.println(person.name);
    }
}
