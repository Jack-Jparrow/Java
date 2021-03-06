import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Java动态代理
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-06 09:17:16
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-06 09:45:17
 */

public class QZJT_JAVA_122 {

    public static void main(String[] args) {
        ITestDemo test = new TestDemoImpl();

        test.test1_122();
        test.test2_122();

        System.out.println("---------------------------");

        /**
         * 需求： 
         * 在执行test1_122和test2_122方法时需要加入一些东西 
         * 在执行方法前打印test1_122或test2_122开始执行
         * 在执行方法后打印test1_122或test2_122执行完毕 
         * 打印的方法名要和当时调用的方法保持一致
         */
        InvocationHandler handler = new ProxyDemo(test/** 代理对象 */
        );

        /**
         * 第1个参数是代理对象的类加载器，即getClassLoader() 
         * 第2个参数是被代理对象的接口 
         * 第3个参数是代理对象
         * 返回的值是成功被代理后的对象，返回的是Object类型，需要根据当时的情况去转换类型
         */
        ITestDemo t = (ITestDemo) Proxy.newProxyInstance(handler.getClass().getClassLoader(),test.getClass().getInterfaces(), handler);

        t.test1_122();
        System.out.println("---------------------------");
        t.test2_122();
    }
}

interface Move_122 {

    void Move_122Type();
}

interface Study_122 {

    void Study_122Info();
}

interface ITestDemo {
    void test1_122();

    void test2_122();
}

class TestDemoImpl implements ITestDemo {

    @Override
    public void test1_122() {
        System.out.println("执行test1_122方法");

    }

    @Override
    public void test2_122() {
        System.out.println("执行test2_122方法");

    }

}

/**
 * 动态代理类
 */
class ProxyDemo implements InvocationHandler {

    Object obj;// 被代理的对象

    ProxyDemo(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "方法开始执行");

        Object result = method.invoke(this.obj, args);// 执行的是指定代理对象的指定的方法

        System.out.println(method.getName() + "方法执行结束");

        return result;
    }

}