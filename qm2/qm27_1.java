/**
 * 请定义一个交通工具(Vehicle)类，
 * 其中有属性：速度(speed)、体积(size),
 * 方法：移动(move)、设置速度，加速speedUp(),减速speedDown().
 * 最后在测试类中的main()中实例化，
 * 初始化speed,size，
 * 然后打印出来，
 * 并进行加速减速改变。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-17 18:02:43 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-20 20:26:06
 */

class Vehicle27_1{
    public Vehicle27_1(int speed, int size){
        this.size = size;
        this.speed = speed;
    }
    int speed;
    int size;
    public void move() {
        //UnsupportedOperationException
    }

    public void speedUp() {
        speed += 3;
        System.out.println("加速后速度：" + speed);
    }

    public void speedDown(){
        speed -= 1;
        System.out.println("减速后速度：" + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

public class qm27_1 {

    public static void main(String[] args) {
        Vehicle27_1 v = new Vehicle27_1(100, 2);

        System.out.println("速度：" + v.speed);
        System.out.println("体积：" + v.size);

        v.speedDown();
        v.speedUp();

    }
}