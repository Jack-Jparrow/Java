/**
 * 编写一个java程序，该程序有两个类：Tank（用于刻画坦克）和Fight（主类）。
 * 要求编写主类Fight，内容如下：
 * 已知坦克类如下：
 *    public class Tank{
 *        double speed;  		//坦克速度
 *        int bulletAmount;	//子弹数量
 *        void speedUp(int s){	//用来加速的方法
 *            speed = speed + s;	}
 *        void speedDown(int d){  //用来减速的方法
 *            if(speed-d >= 0)
 *                speed = speed -d;
 *            else
 *                speed = 0;	}	
 *        void setBulletAmount(int m){  //设置炮弹数量
 *            bulletAmount = m;	}
 *        int getBulletAmount(){        //获得炮弹数量
 *            return bulletAmount;	}
 *        double getSpeed(){            //获取坦克速度
 *            return speed;	}
 *        void fire(){                  //方法：开火，开火后炮弹数量-1
 *            if(bulletAmount >= 1){
 *                bulletAmount = bulletAmount -1;
 *                System.out.println("打出一发炮弹");		}
 *            else {
 *                System.out.println("没有炮弹了，无法开火");			}
 *        }	
 *    }
 * (1)创建两个对象tank1，tank2。
 * (2)两个对象分别调用setBulletAmount方法，tank1设置10发炮弹，tank2设置20发炮弹。之后显示两辆坦克的炮弹数量
 * (3)为两辆坦克加速tank1加速80，tank2加速90。之后显示两辆坦克的速度。
 * (4)为两辆坦克减速tank1减15，tank2减速30。之后显示两辆坦克的速度。
 * (5)tank1开火一次，tank2开火两次。之后显示两辆坦克的炮弹数量。
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-14 20:20:35
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-14 20:32:57
 */

class Tank {
    double speed; // 坦克速度
    int bulletAmount; // 子弹数量

    void speedUp(int s) { // 用来加速的方法
        speed = speed + s;
    }

    void speedDown(int d) { // 用来减速的方法
        if (speed - d >= 0)
            speed = speed - d;
        else
            speed = 0;
    }

    void setBulletAmount(int m) { // 设置炮弹数量
        bulletAmount = m;
    }

    int getBulletAmount() { // 获得炮弹数量
        return bulletAmount;
    }

    double getSpeed() { // 获取坦克速度
        return speed;
    }

    void fire() { // 方法：开火，开火后炮弹数量-1
        if (bulletAmount >= 1) {
            bulletAmount = bulletAmount - 1;
            System.out.println("打出一发炮弹");
        } else {
            System.out.println("没有炮弹了，无法开火");
        }
    }
}

public class qm35 {

    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();

        tank1.setBulletAmount(10);
        tank2.setBulletAmount(20);

        System.out.println("tank1的炮弹数量：" + tank1.getBulletAmount());
        System.out.println("tank2的炮弹数量：" + tank2.getBulletAmount());

        tank1.speedUp(80);
        tank2.speedUp(90);

        System.out.println("加速后tank1的速度：" + tank1.getSpeed());
        System.out.println("加速后tank2的速度：" + tank2.getSpeed());

        tank1.speedDown(15);
        tank2.speedDown(30);

        System.out.println("减速后tank1的速度：" + tank1.getSpeed());
        System.out.println("减速后tank2的速度：" + tank2.getSpeed());

        System.out.print("tank1");
        tank1.fire();
        System.out.print("tank2");
        tank2.fire();
        System.out.print("tank2");
        tank2.fire();

        System.out.println("tank1的炮弹数量：" + tank1.getBulletAmount());
        System.out.println("tank2的炮弹数量：" + tank2.getBulletAmount());
    }
}