/**
 * 线程的通信
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-10 14:12:20
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-10 14:18:20
 */

public class QZJT_JAVA_134 {

    public static void main(String[] args) {
        // 定义账户对象
        Account a = new Account();
        Account b = new Account();

        // 多线程对象
        User u_wx = new User(a, 2000);
        User u_zfb = new User(a, 2000);
        Thread wx = new Thread(u_wx, "微信");
        Thread zfb = new Thread(u_zfb, "支付宝");

        wx.start();
        zfb.start();
    }
}

class Account {
    public static int money_134 = 3000;// 全局变量，所有操作共享

    /**
     * 提款，判断钱够不够
     * 
     * @param m
     */
    public synchronized void drawing1(int m) {
        String name = Thread.currentThread().getName();

        if (money_134 < m) {
            System.out.println(name + "操作1，账户金额不足：" + money_134);
        } else {
            System.out.println(name + "操作1，账户原有：" + money_134);
            System.out.println(name + "操作1，取款：" + m);
            System.out.println(name + "操作1，账户原有金额：" + money_134 + " 取款金额1：" + m);

            money_134 = money_134 - m;
            System.out.println(name + "操作1，取款后余额：" + money_134);
        }
    }

    public synchronized void drawing2(int m) {
        String name = Thread.currentThread().getName();

        if (money_134 < m) {
            System.out.println(name + "操作2，账户金额不足：" + money_134);
        } else {
            System.out.println(name + "操作2，账户原有：" + money_134);
            System.out.println(name + "操作2，取款：" + m);
            System.out.println(name + "操作2，账户原有金额：" + money_134 + " 取款金额2：" + m);

            money_134 = money_134 - m;
            System.out.println(name + "操作，取款后余额：" + money_134);
        }
    }

    /**
     * 静态的方法加synchronized，对于所有的对象都是同一个锁
     * 
     * @param m
     */
    public static synchronized void drawing3(int m) {
        String name = Thread.currentThread().getName();

        if (money_134 < m) {
            System.out.println(name + "操作3，账户金额不足：" + money_134);
        } else {
            System.out.println(name + "操作3，账户原有：" + money_134);
            System.out.println(name + "操作3，取款：" + m);
            System.out.println(name + "操作3，账户原有金额：" + money_134 + " 取款金额3：" + m);

            money_134 = money_134 - m;
            System.out.println(name + "操作3，取款后余额：" + money_134);
        }
    }

    /**
     * 代码块加同步锁
     * 
     * @param m
     */
    public void drawing4(int m) {
        // 用this锁代码块代表当前的对象，如果在其它方法中也使用synchronized (this)代码块，使用的是同一个同步锁
        synchronized (this) {// 当前对象的代码块被加了同步锁
            String name = Thread.currentThread().getName();

            if (money_134 < m) {
                System.out.println(name + "操作4，账户金额不足：" + money_134);
            } else {
                System.out.println(name + "操作4，账户原有：" + money_134);
                System.out.println(name + "操作4，取款：" + m);
                System.out.println(name + "操作4，账户原有金额：" + money_134 + " 取款金额4：" + m);

                money_134 = money_134 - m;
                System.out.println(name + "操作4，取款后余额：" + money_134);
            }
        }

    }

    public void drawing5(int m) {
        // 用this锁代码块代表当前的对象，如果在其它方法中也使用synchronized (this)代码块，使用的是同一个同步锁
        synchronized (this) {// 当前对象的代码块被加了同步锁
            String name = Thread.currentThread().getName();

            if (money_134 < m) {
                System.out.println(name + "操作5，账户金额不足：" + money_134);
            } else {
                System.out.println(name + "操作5，账户原有：" + money_134);
                System.out.println(name + "操作5，取款：" + m);
                System.out.println(name + "操作5，账户原有金额：" + money_134 + " 取款金额5：" + m);

                money_134 = money_134 - m;
                System.out.println(name + "操作5，取款后余额：" + money_134);
            }
        }

    }

    /**
     * synchronized修饰代码块，想要根据不同的对象有不同的锁 synchronized (a)括号中就传不同对象
     * 
     * @param m
     */
    public void drawing6(int m, Account a) {
        synchronized (a) {// 通过方法的参数传递进来的对象的代码块被加了同步锁
            // 不同的对象不同的同步锁
            String name = Thread.currentThread().getName();

            // 如果是微信操作的，先不执行，等支付宝操作，支付宝操作完，微信再继续操作
            if (name.equals("微信")) {
                try {
                    a.wait();// 当前进程进入等待的阻塞状态
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            if (money_134 < m) {
                System.out.println(name + "操作6，账户金额不足：" + money_134);
            } else {
                System.out.println(name + "操作6，账户原有：" + money_134);
                System.out.println(name + "操作6，取款：" + m);
                System.out.println(name + "操作6，账户原有金额：" + money_134 + " 取款金额6：" + m);

                money_134 = money_134 - m;
                System.out.println(name + "操作6，取款后余额：" + money_134);
            }

            if (name.equals("支付宝")) {
                try {
                    a.notify();// 唤醒当前优先级最高的线程，进入就绪状态
                    a.notifyAll();// 唤醒当前所有线程，进入就绪状态
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }
}

class User implements Runnable {
    Account account;
    int money_134;

    public User(Account account, int money_134) {
        this.account = account;
        this.money_134 = money_134;
    }

    @Override
    public void run() {
        // account.drawing1(money_134);

        // if (Thread.currentThread().getName().equals("wx")) {
        // account.drawing4(money_134);
        // } else {
        // account.drawing5(money_134);
        // }

        // account.drawing3(money_134);// 调用类的静态方法

        // account.drawing4(money_134);

        account.drawing6(money_134, account);
    }

}