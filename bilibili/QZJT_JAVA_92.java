/**
 * 自定义异常
 *
 * @Author: Jack Jparrow 
 * @Date: 2021-01-17 16:33:59 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-01-17 16:48:34
 */

class MyException extends Exception{
    public MyException(String msg){
        super(msg);//调用父类构造方法
    }
}

class B_92 {
    int i;

    // NullPointerException父类是Exception
    public void test_92() throws NullPointerException {// 可以使用throws在代码中抛出异常，在调用方去捕获处理
        B_90 b = null;
        System.out.println(b.i);
    }

    int age;

    public void test3_92(int age) throws MyException {
        if (age >= 0 && age <= 150) {
            this.age = age;
            System.out.println("age is " + age);
        } else {
            throw new MyException("age 不在0~150之间");// 人工抛出异常
        }
    }
}

public class QZJT_JAVA_92 {

    public static void main(String[] args) throws Exception {
        B_92 b = new B_92();

        b.test3_92(-9);
    }
}