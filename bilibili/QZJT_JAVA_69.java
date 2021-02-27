/**
 * 接口
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-07 13:36:03
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-07 13:50:38
 */
interface TestIn {
    int ID = 1;// == public static final int ID

    void test();// == public abstract void test()
}

interface TestIn1 {

    void test1();
}

interface TestIn2 extends TestIn1 {

    void test2();
}

// 若类没有实现接口的所有方法，就要被定义为抽象类
abstract class TestInImpl1 implements TestIn {

}

// 如果一个类，既继承父类，又实现接口，就先继承，后实现
class TestInImpl2 extends Person implements TestIn, TestIn1 {

    @Override
    public void test() {
        // TODO Auto-generated method stub

    }

    @Override
    public void test1() {
        // TODO Auto-generated method stub

    }
}

public class QZJT_JAVA_69 implements TestIn, TestIn1 {

    @Override
    public void test() {
        // TODO Auto-generated method stub
    }

    @Override
    public void test1() {
        // TODO Auto-generated method stub

    }
}
