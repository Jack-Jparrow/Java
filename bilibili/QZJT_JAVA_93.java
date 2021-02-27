/**
 * 枚举类
 *
 * @Author: Jack Jparrow
 * @Date: 2021-01-28 09:43:04
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-01-28 10:18:27
 */

enum Season_93 {
    SPRING("春天", "春暖花开"), // ==调用构造方法
    SUMMER("夏天", "炎炎夏日"), // ==调用构造方法
    AUTUMN("秋天", "秋高气爽"), // ==调用构造方法
    WINTER("冬天", "寒风凛冽");// ==调用构造方法

    private final String name;
    private final String desc;

    private Season_93(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public void showInfo() {
        System.out.println(this.name + "：" + this.desc);
    }
}

public class QZJT_JAVA_93 {

    public static void main(String[] args) {
        Season_93 spring = Season_93.SPRING;// 获取一个Season_93的对象，每次执行Season_93.SPRING都获得相同的对象，枚举类中的每个枚举都是单例模式
        Season_93 summer = Season_93.SUMMER;
        Season_93 autumn = Season_93.AUTUMN;
        Season_93 winter = Season_93.WINTER;

        spring.showInfo();
        summer.showInfo();
        autumn.showInfo();
        winter.showInfo();
    }
}