import java.util.ArrayList;
import java.util.List;

/**
 * 泛型通配符
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-11 19:56:26
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-11 20:08:56
 */

class Dd {
    public void test(List<?> list) {// test方法需费一个list集合的参数，不确定ist集合到底是存的数的类型是什么

    }

    public void test1(List<? extends C1> list) {// list参数的元素数据类型是C1及其子类

        // UnsupportedOperationException
    }

    public void test2(List<? super C1> list) {// list参数的元素数据类型是C1及其父类

        // UnsupportedOperationException
    }

    public void test3(List<? extends IA> list) {// list参数的元素数据类型是IA的实现类

        // UnsupportedOperationException
    }
}

class A1 {
}

class B84 extends A1 {
}

class C1 extends B84 {
}

class D1 extends C1 {
}

class E1 extends D1 {
}

interface IA {
}

class IAImpl implements IA {
}

public class QZJT_JAVA_84 {

    public static void main(String[] args) {
        Dd d = new Dd();

        List<String> l1 = new ArrayList<>();
        d.test(l1);

        List<Integer> l2 = new ArrayList<>();
        d.test(l2);

        List<C1> lc = new ArrayList<>();
        d.test1(lc);

        List<D1> ld = new ArrayList<>();
        d.test1(ld);

        d.test2(lc);

        List<A1> la = new ArrayList<>();
        d.test2(la);

        List<IAImpl> lia = new ArrayList<>();
        d.test3(lia);

    }
}