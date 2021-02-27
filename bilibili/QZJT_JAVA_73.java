/**
 * 内部类解决多重继承问题
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-08 09:17:51
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-08 09:26:59
 */
class A {
    public void testB() {
        new InnerB().testB();
    }

    public void testC() {
        new InnerC().testC();
    }

    private class InnerB extends B {

        @Override
        public void testB() {
            System.out.println("这是重写之后的testB");
        }
    }

    private class InnerC extends C {

        @Override
        public void testC() {
            System.out.println("这是重写之后的testC");
        }

    }
}

// 现在需要A同时获得BC的方法，并重写
// 可以使用内部类变相实现多重继承，同时实现多个类
class B {
    public void testB() {

    }
}

class C {
    public void testC() {

    }
}

public class QZJT_JAVA_73 {

    public static void main(String[] args) {
        A a = new A();

        a.testB();
        a.testC();
    }
}