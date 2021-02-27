/**
 * ==操作符与equals方法
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-03 20:58:34
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-03 21:04:57
 */
public class QZJT_JAVA_54 {

    public static class Person {

    }

    public static void main(String[] args) {
        int i = 10;
        System.out.println(i == 3);

        Person p1 = new Person();
        Person p2 = p1;
        Person p3 = new Person();
        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
    }
}