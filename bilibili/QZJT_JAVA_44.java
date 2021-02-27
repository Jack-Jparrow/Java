/**
 * JavaBean
 *
 * @Author: Jack Jparrow
 * @Date: 2020-11-26 09:09:42
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-11-26 09:25:13
 */

// 一个完整的JavaBean↓

class Person0 {
    private String name;
    private String sex;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println(name);
        return this.name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        System.out.println(sex);
        return this.sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        System.out.println(age);
        return this.age;
    }
}
    // 一个完整的JavaBean↑

public class QZJT_JAVA_44 {
    public static void main(String[] args) {
        Person0 person = new Person0();
        person.setSex("man");
        person.setName("张三");
        person.setAge(20);

        person.getName();
        person.getSex();
        person.getAge();
    }
}
