import java.util.*;

/**
 * TreeSet
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-10 19:30:21
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-10 19:40:17
 */

class Person75 implements Comparator<Person75> {// 把person对象存到treeset中并且按照年龄排序
    int age;
    String name;

    public Person75() {

    }

    public Person75(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compare(Person75 o1, Person75 o2) {
        if (o1.age > o2.age) {
            return 1;
        } else if (o1.age < o2.age) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class QZJT_JAVA_76 {

    public static void main(String[] args) {
        Person75 p1 = new Person75("张二", 24);
        Person75 p2 = new Person75("张三", 21);
        Person75 p3 = new Person75("张六", 23);
        Person75 p4 = new Person75("张七", 22);
        Person75 p5 = new Person75("张四", 20);

        Set<Person75> set = new TreeSet<>(new Person75());

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        for (Person75 p : set) {
            System.out.println(p.name + "  " + p.age);
        }
    }
}
