import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-11 13:23:25
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-11 13:58:48
 */

class Student79 implements Comparator<Student79> {

    int age;
    String name;

    public Student79() {

    }

    public Student79(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compare(Student79 o1, Student79 o2) {// 根据年龄升序排列对象
        if (o1.age > o2.age) {
            return 1;
        } else if (o1.age < o2.age) {
            return -1;
        } else {
            return 0;
        }
    }

}

public class QZJT_JAVA_79 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("cd");
        list.add("ca");
        list.add("ca");
        list.add("dc");
        list.add("1");

        System.out.println(list);

        Collections.reverse(list);// 反转字符串
        System.out.println(list);

        Collections.shuffle(list);// 随机排序
        System.out.println(list);

        Collections.sort(list);// 字典升序排列
        System.out.println(list);

        Student79 s1 = new Student79("张三", 15);
        Student79 s2 = new Student79("张七", 17);
        Student79 s3 = new Student79("张六", 14);
        Student79 s4 = new Student79("张二", 16);

        List<Student79> stus = new ArrayList<>();
        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        stus.add(s4);

        for (Student79 stu : stus) {
            System.out.println(stu.name + ": " + stu.age);
        }

        System.out.println("======================");

        Collections.sort(stus, new Student79());
        for (Student79 stu : stus) {
            System.out.println(stu.name + ": " + stu.age);
        }

        Collections.swap(list, 0, 4);// 调换位置
        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        Student79 ss1 = Collections.max(stus, new Student79());
        System.out.println(ss1.name + ":" + ss1.age);
        Student79 ss2 = Collections.min(stus, new Student79());
        System.out.println(ss2.name + ":" + ss2.age);

        System.out.println(Collections.frequency(list, "ca"));// 指定元素出现次数

        Collections.replaceAll(list, "b", "aa");// 新值替换所有旧值
        System.out.println(list);
    }
}