/**
 * 线程睡眠
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-08 08:48:00
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-08 08:52:31
 */
public class QZJT_JAVA_130 {

    public static void main(String[] args) {
        testRun_130 run0 = new testRun_130();
        testRun_130 run1 = new testRun_130();

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

        System.out.println("----------3----------");
    }
}

class testRun_130 implements Runnable {
    int count = 0;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Runnable多线程运行的代码");

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);// 当前线程睡眠1000毫秒
                // 相当于当前的这个循环每隔1000毫秒执行一次
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            count++;
            System.out.println(Thread.currentThread().getName() + "这是Runnable多线程的逻辑代码" + count);
        }
    }

}