/**
 * 代码块
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-06 08:35:31
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-06 08:39:19
 */
class Person {
    String name;
    static int age;

    public Person() {
        // 第一步执行
        this.name = "张三";

        // 第三步执行
        System.out.println("执行的是构造方法");
    }

    // 非静态代码块（第三步执行）
    {
        System.out.println("执行的是非静态代码块");
    }

    // 非静态代码块2
    {
        System.out.println("执行的是非静态代码块2");
    }

    // 静态代码块（第二步执行）
    static {
        age = 10;
        showAge();

        System.out.println("执行的是静态代码块");
    }

    // 静态代码块2
    static {
        System.out.println("执行的是静态代码块2");
    }

    public static void showAge() {
        System.out.println(age);
    }

    public void test() {
        System.out.println("person的test方法");
    }
}

public class QZJT_JAVA_64 {

    public static void main(String[] args) {
        new Person();
        new Person();

        // 匿名内部类（构建了一个没有类名的Person子类）
        // 意味着不能用显式的new方法创建对象（没有构造器）
        // 需要用代码块初始化
        Person p = new Person() {// 本身就是一个Person的匿名子类
            // 用代码块代替构造方法
            {
                super.name = "张四";
            }

            @Override
            public void test() {
                System.out.println("===");
            }
        };

        System.out.println(p.name);
        p.test();

    }
}