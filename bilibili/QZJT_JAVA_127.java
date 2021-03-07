/**
 * 优先级（1-10表示，越大越高）
 *
 * @Author: Jack Jparrow 
 * @Date: 2021-03-07 15:48:56 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-07 15:55:19
 */
public class QZJT_JAVA_127 {

    public static void main(String[] args) {
        testRun_127 run0 = new testRun_127();
        testRun_127 run1 = new testRun_127();

        Thread t0 = new Thread(run0);
        Thread t1 = new Thread(run1);

        t0.setName("线程t0");
        t1.setName("线程t1");

        t0.setPriority(1);//设置线程优先级
        t1.setPriority(10);
        System.out.println("t0优先级：" + t0.getPriority());//获取优先级
        System.out.println("t1优先级：" + t1.getPriority());

        t0.start();
        t1.start();

        System.out.println("----------1----------");
        System.out.println("----------2----------");
        System.out.println("----------3----------");
    }
}

class testRun_127 implements Runnable {
    int count = 0;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Runnable多线程运行的代码");

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "这是Runnable多线程的逻辑代码" + i);
        }
    }

}