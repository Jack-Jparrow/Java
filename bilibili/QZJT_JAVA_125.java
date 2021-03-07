/**
 * 
 *
 * @Author: Jack Jparrow 
 * @Date: 2021-03-07 14:56:02 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-07 15:26:59
 */

public class QZJT_JAVA_125 {

    public static void main(String[] args) {
        TestRunnablet2_125 run = new TestRunnablet2_125();

        Thread t1 = new Thread(run, "t_1");
        t1.start();

        Thread t2 = new Thread(run, "t_2"/**线程名称 */);
        t2.start();

        System.out.println("----------1----------");
        System.out.println("----------2----------");
        System.out.println("----------3----------");  
    }
}

class TestRunnablet2_125 implements Runnable{
    int count = 0;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Runnable多线程运行的代码");

        for (int i = 0; i < 5; i++) {
            count++;

            System.out.println(Thread.currentThread().getName() + "这是Runnable多线程的逻辑代码：" + count);
        }
        
    }

}