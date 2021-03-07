/**
 * Thread类的相关方法
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-07 15:39:06
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-07 15:46:34
 */

public class QZJT_JAVA_126 {

    public static void main(String[] args) {
        testRun run0 = new testRun();
        testRun run1 = new testRun();

        Thread t0 = new Thread(run0);
        Thread t1 = new Thread(run1);

        t0.start();
        t1.start();

        // t0.setName("线程t0");// 设置线程名称

        System.out.println(t0.getName());// 如果在创建线程的时候没有指定名称，系统会给出默认名称，通过getName()获取线程名称
        System.out.println(t1.getName());

        System.out.println("----------1----------");
        System.out.println("----------2----------");
        System.out.println("----------3----------");
    }
}

class testRun implements Runnable {
    int count = 0;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Runnable多线程运行的代码");

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "这是Runnable多线程的逻辑代码" + i);
        }
    }

}