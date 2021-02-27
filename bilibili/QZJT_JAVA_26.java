/**
 * 做一个Person的类
 */
public class QZJT_JAVA_26 {
    // 属性，成员变量
    String name;// String默认为null
    int age;// int默认为0

    // 行为，方法，函数
    /**
     * 输出姓名
     */
    public void showName() {
        System.out.println(name);
    }

    /**
     * 获取年龄
     * 
     * @return
     */
    public int getAge() {// 如果是一个有返回值的方法，那么方法的最后一行一定是返回相应的数据，用return
        return age;
    }

    public static void main(String[] args) {
        // 实例化Person/创建Person对象
        QZJT_JAVA_26 person = /* 实例化→ */new QZJT_JAVA_26()/* ← */;// 声明一个QZJT_JAVA_26类（Person类），变量名person，实例化并赋值（值为当前的实例）
        
        person.name = "张三";// 给person对象的name属性赋值
        person.age = 10;
        person.showName();// 对象方法的调用

        int i = person.getAge();// 有返回值的方法，在调用之后有一个值，这个值就是方法中return的部分
        System.out.println(i);
    }
}