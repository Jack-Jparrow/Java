/**
 * 接口
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-07 20:19:25
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-07 21:02:57
 */
abstract class Person70 {
    int age;
    String name;
    String sex;

    abstract void showInfo();
}

interface Cooking {

    void cook();
}

interface Sing {
    void singing();
}

class SCTeacher extends Person70 implements Cooking, Sing {

    String course;

    @Override
    public void singing() {
        System.out.println(super.name + "老师是好歌手");
    }

    @Override
    public void cook() {
        System.out.println(super.name + "老师是好厨师");
    }

    @Override
    void showInfo() {
        System.out.println("会唱歌的厨子的老师的信息：");
        System.out.println(super.name);
        System.out.println(super.age);
        System.out.println(super.sex);
        System.out.println(this.course);
    }

    public void setInfo() {
        super.name = "张三";
        super.age = 30;
        super.sex = "man";
        this.course = "Java";
    }

}

public class QZJT_JAVA_70 {

    public static void main(String[] args) {
        SCTeacher sct = new SCTeacher();

        sct.setInfo();
        sct.showInfo();

        sct.cook();
        sct.singing();

        // 体现了对象的多态性↓
        Cooking c = new SCTeacher();
        c.cook();
        Sing s = new SCTeacher();
        s.singing();
    }
}
