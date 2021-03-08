/**
 * 线程阻塞插队
 *
 * @Author: Jack Jparrow 
 * @Date: 2021-03-08 08:47:17 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-08 08:47:42
 */
public class QZJT_JAVA_129 {

    public static void main(String[] args) {
        testRun_129 run0 = new testRun_129();
        testRun_129 run1 = new testRun_129();

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
        try {
            t0.join();// 相当于在这块把run的代码插入到这个位置执行，这个执行时是同步的
            /**
             * 专业的说法
             * 就是阻塞当前的main方法，先不执行System.out.println("----------3----------");
             * 先执行join进来的线程的代码
             * join的线程执行完毕之后继续执行之前的main方法阻塞的代码System.out.println("----------3----------");
             */
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("----------3----------");
    }
}

class testRun_129 implements Runnable {
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