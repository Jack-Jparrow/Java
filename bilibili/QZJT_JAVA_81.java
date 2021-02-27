/**
 * 泛型类
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-11 18:24:41
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-11 18:33:42
 */
class A81<T> {
    private T key;

    public void setKey(T key) {
        this.key = key;
    }

    public T getKey() {
        return this.key;
    }
}

public class QZJT_JAVA_81 {

    public static void main(String[] args) {
        A81<String> a1 = new A81<>();// 在new A的对象指定泛型的类型String
        a1.setKey("key");// 对象使用set方法，中的key的形参是String
        String s = a1.getKey();// T geKey()，返回值就有new对象确定返回值是String

        A81<Integer> a2 = new A81<>();
        a2.setKey(2);
        Integer i = a2.getKey();

        A81 a3 = new A81<>();// ==泛型指定为Object
        a3.setKey(new Object());
        Object obj = a3.getKey();
    }
}