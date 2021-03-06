/**
 * 继承Thread的方式实现多线程
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-06 15:34:20
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-06 15:50:36
 */

public class QZJT_JAVA_123 {
    public static void main(String[] args) {
        Thread t0 = new testThread();
        t0.start();//启动线程，开始运行run方法中的东西

        System.out.println("----------1----------");
        System.out.println("----------2----------");
        System.out.println("----------3----------");

        /**
         * 多次运行Thread方法后
         * 发现main方法中打印的三行与开启线程运行的run方法中的打印语句混合
         * 且main方法中的打印与run的打印语顺序不固定
         * 
         * 当main方法执行.start()开启多线程后，就相当于在main方法外开启支流
         * 此时.start()后的main的其他代码就与run的运行无关了
         * 以当前代码为例，
         * .start()后的main的其他代码就与run的并行运行，各走各的，没有先后关系
         * 控制台输出的结果就是两条并行程序的运行结果综合，结果需要拆开成两部分看
         * 就可以看到各自保持了自己的输出顺序
         * 这就是多线程的异步（相对于执行.start()的主程序）
         */
    }
}

class testThread extends Thread {

    @Override
    public void run() {
        System.out.println("多线程运行的代码");

        for (int i = 0; i < 5; i++) {
            System.out.println("这是多线程的逻辑代码" + i);
        }

        super.run();
    }

}