/**
 * 构造方法重载
 * 
 * @Author: Jack Jparrow
 * @Date: 2020-11-25 20:14:29
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-11-25 20:34:49
 */
public class QZJT_JAVA_42 {
    public QZJT_JAVA_42() {

    }

    public QZJT_JAVA_42(int a) {

    }

    public QZJT_JAVA_42(String b) {

    }

    public QZJT_JAVA_42(int c, String d) {
        age = c;
        name = d;
    }

    int age;
    String name;

    public static void main(String[] args) {
        new QZJT_JAVA_42();
        new QZJT_JAVA_42(18);
        new QZJT_JAVA_42("张三");
        new QZJT_JAVA_42(20, "李四");
    }
}
