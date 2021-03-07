/**
 * 实现Runnable接口实现多线程
 *
 * @Author: Jack Jparrow 
 * @Date: 2021-03-07 10:09:08 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-07 10:20:41
 */

public class QZJT_JAVA_124 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new TestRunnablet1());
        t1.start();

        Thread t2 = new Thread(new TestRunnablet2(), "t_2"/**线程名称 */);
        t2.start();

        System.out.println("----------1----------");
        System.out.println("----------2----------");
        System.out.println("----------3----------");  
    }
}

class TestRunnablet1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable多线程运行的代码");

        for (int i = 0; i < 5; i++) {
            System.out.println("这是Runnable多线程的逻辑代码" + i);
        }
        
    }

}

class TestRunnablet2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Runnable多线程运行的代码");

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "这是Runnable多线程的逻辑代码" + i);
        }
        
    }

}