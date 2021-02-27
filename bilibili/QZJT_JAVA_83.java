/**
 * 泛型方法
 * 
 * @param <E>
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-11 19:00:58
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-11 19:13:15
 */

class Cc<E> {

    private E e;// 定义泛型变量

    // 静态方法
    public static <T> void test3(T t) {
        // 静态方法中不能使用类定义的泛型
        // 若要使用，需要自己定义
        System.out.println(t);
    }

    // 无返回值
    public <T> void test(T s) {
        // 在类中定义的泛型可以在普通的方法中使用
        System.out.println(this.e);
        T t = s;
    }

    // 有返回值
    public <T> T test1(T s) {
        return s;
    }

    // 可变参数类型
    public <T> void test2(T... strs) {
        for (T s : strs) {
            System.out.println(s);
        }
    }
}

public class QZJT_JAVA_83 {

    public static void main(String[] args) {
        Cc<Object> c = new Cc();
        c.test("s");
        // 泛型方法在调用之前没有固定的数据类型
        // 在调用时，传入的参数是什么类型，就会把泛型改成什么类型
        // 泛型方法会在调用时确定泛型的具体数据类型
        Integer i = c.test1(2);
        Boolean b = c.test1(true);
    }
}