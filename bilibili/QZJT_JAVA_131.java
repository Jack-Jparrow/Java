/**
 * 强制线程生命期结束
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-08 08:54:47
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-08 08:59:16
 */
public class QZJT_JAVA_131 {

    public static void main(String[] args) {
        testRun_131 run0 = new testRun_131();
        testRun_131 run1 = new testRun_131();

        Thread t0 = new Thread(run0);
        Thread t1 = new Thread(run1);

        t0.setName("线程t0");
        t1.setName("线程t1");

        // System.out.println("t0优先级：" + t0.getPriority());// 获取优先级
        // System.out.println("t1优先级：" + t1.getPriority());

        t0.start();
        t1.start();

        System.out.println("----------1----------");
        System.out.println("----------2----------");
        t1.stop();// 强制线程生命期结束
        System.out.println("----------3----------");
    }
}

class testRun_131 implements Runnable {
    int count = 0;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Runnable多线程运行的代码");

        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + "这是Runnable多线程的逻辑代码" + count);
        }
    }

}