/**
 * 抛出异常
 *
 * @Author: Jack Jparrow
 * @Date: 2021-01-17 16:18:37
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-01-17 16:32:23
 */
class B_91 {
    int i;

    // NullPointerException父类是Exception
    public void test_91() throws NullPointerException {// 可以使用throws在代码中抛出异常，在调用方去捕获处理
        B_90 b = null;
        System.out.println(b.i);
    }

    int age;

    public void test3_91(int age) throws Exception {
        if (age >= 0 && age <= 150) {
            this.age = age;
            System.out.println("age is " + age);
        } else {
            throw new Exception("age 不在0~150之间");// 人工抛出异常
        }
    }
}

class C_91 extends B_91 {
    public void test2_91() throws NullPointerException {
        // public void test2_91() throws Exception {// 重写方法不能抛出比被重写方法范围更大的异常类型
        super.test_91();
    }
}

public class QZJT_JAVA_91 {

    public static void main(String[] args) throws Exception {// 可以在main方法继续抛出异常
        // main方法抛出异常直接抛到虚拟机上去，在程序中不能处理
        B_91 b = new B_91();

        try {// throws在代码中抛出的异常，再调用方去捕获处理
            b.test_91();
        } catch (Exception e) {
            e.printStackTrace();
        }

        b.test3_91(160);
    }
}