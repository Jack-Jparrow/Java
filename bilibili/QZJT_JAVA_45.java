/**
 * JavaBean
 * 
 * @Author: Jack Jparrow 
 * @Date: 2020-11-29 19:16:55 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-11-29 19:19:18
 */

// 一个完整的JavaBean↓

class Person1 {
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //以上set和get为自动生成

    /* public void setName(String name) {
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
    } */
}
    // 一个完整的JavaBean↑

public class QZJT_JAVA_45 {
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.setSex("man");
        person.setName("张三");
        person.setAge(20);

        person.getName();
        person.getSex();
        person.getAge();
    }
}
