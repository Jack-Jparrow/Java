/**
 * 生产者与消费者
 *
 * @Author: Jack Jparrow 
 * @Date: 2021-03-10 14:25:02 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-10 14:43:24
 */

public class QZJT_JAVA_135 {

    public static void main(String[] args) {
        Clerk c = new Clerk();

        //消费时不生产，生产是不消费
        //生产者
        new Thread(new Runnable(){

            @Override
            public void run() {
                synchronized(c){
                    try {
                        while (true) {//无限循环代表无限的生产次数
                            if (c.productNum == 0) {//产品数为0，开始生产
                                System.out.println("产品数为0，开始生产");
                                while (c.productNum < 4) {
                                    c.productNum++;//增加产品
                                    System.out.println("库存：" + c.productNum);
                                }
                                System.out.println("产品数为：" + c.productNum + "，结束生产");
                                
                                c.notify();//唤醒消费者
                            }else{
                                c.wait();//让生产者线程等待
                            }
                        }
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }, "生产者").start(); 

        //消费者
        new Thread(new Runnable(){

            @Override
            public void run() {
                synchronized(c){
                    try {
                        while (true) {//无限循环代表无限的消费次数
                            if (c.productNum == 4) {//产品数为4，开始消费
                                System.out.println("产品数为4，开始消费");
                                while (c.productNum > 0) {
                                    c.productNum--;//减消费产品
                                    System.out.println("库存：" + c.productNum);
                                }
                                System.out.println("产品数为：" + c.productNum + "，结束消费");
                                
                                c.notify();//唤醒生产者
                            }else{
                                c.wait();//让生产者消费者线程等待
                            }
                        }
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }, "消费者").start();
    }
}

class Clerk{
    public static int productNum = 0;
}
