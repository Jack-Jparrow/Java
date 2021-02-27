/**
 * static
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-05 15:24:51
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-05 17:43:18
 */
class Chinese {
    static String country;
    String name;
    int age;

    public static void test() {
        System.out.println("这是一个静态方法");
    }
}

public class QZJT_JAVA_60 {
    public static void main(String[] args) {
        Chinese.country = "中国";
        
        Chinese e1 = new Chinese();
        Chinese e2 = new Chinese();
        Chinese e3 = new Chinese();
        
        e1.name = "张三";
        e1.age = 20;
        e2.name = "张四";
        e2.age = 21;
        e3.name = "张五";
        e3.age = 22;
        
        System.out.println(Chinese.country);
        System.out.println(Chinese.country);
        System.out.println(Chinese.country);
        
        Chinese.test();
    }
}