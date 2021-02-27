/**
 * 泛型接口
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-11 18:35:46
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-11 18:49:11
 */

interface IB<T> {

    T test(T t);
}

// 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
class B1<T> implements IB<T> {

    @Override
    public T test(T t) {
        return t;
    }

}

// 如果实现接口时指定接口的泛型的具体数据类型
// 这个类实现接口所有方法的位置都用泛型替换实际的具体数据类型
class B2 implements IB<String> {

    @Override
    public String test(String t) {
        return null;
    }

}

public class QZJT_JAVA_82 {

    B1<Object> b1 = new B1<>();
    B1<String> b2 = new B1<>();
    B1<Integer> b3 = new B1<>();

    B2 b4 = new B2();
}