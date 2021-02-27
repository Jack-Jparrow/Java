/**
 * 请定义一个交通工具（Vehicle）类，
 * 其中有属性：速度（speed）、体积（size）,
 * 方法：移动（move）、设置速度，加速speedUp(),减速speedDown（）.
 * 最后在测试类中的main()中实例化，
 * 初始化speed,size，
 * 然后打印出来，
 * 并进行加速减速改变。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-14 18:07:18 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-14 18:18:54
 */

class Vehicle{
    public Vehicle(double speed, double size){
        this.speed = speed;
        this.size = size;
    }

    double speed;
    double size;

    public void move(){
        //UnsupportedOperationException
    }

    public void speedUp(){
        speed += 1;
        System.out.println("加速后的速度为：" + speed + " km/h");
    }

    public void speedDown(){
        speed -= 1.5;
        System.out.println("减速后的速度为：" + speed + " km/h");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
}

public class qm27 {

    public static void main(String[] args) {
        Vehicle v = new Vehicle(60, 1.2);

        System.out.println("速度为：" + v.getSpeed() + " km/h");
        System.out.println("size为：" + v.getSize() + " t");

        v.speedUp();
        v.speedDown();
    }
}
