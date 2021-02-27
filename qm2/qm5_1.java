/**
 * 编写一个Java应用程序。
 * 首先，定义一个时钟类——Clock，
 * 它包括三个int型成员变量分另是表示时、分、秒，
 * 一个构造方法用于对三个成员变量（时，分，秒）进行初始化，
 * 还有一个成员方法show()用于显示时钟对象的时间。
 * 其次，再定义一个类——TestClass,
 * 在主类的main方法中创建多个时钟类的对象，
 * 使用这些对象调用方法show()来显示时钟的时间。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-15 19:25:27 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-15 19:43:53
 */

class Clock5_1{
    public Clock5_1(int h, int m, int s){
        this.hour = h;
        this.min = m;
        this.sec = s;
    }
    int hour;
    int min;
    int sec;

    public void show(){
        System.out.println("时间是：" +hour + "时" + min + "分" + sec + "秒");
    }
}

public class qm5_1 {

    public static void main(String[] args) {
        Clock5_1 time1 = new Clock5_1(5, 20, 13);
        Clock5_1 time2 = new Clock5_1(14, 00, 05);
        Clock5_1 time3 = new Clock5_1(20, 13, 14);

        time1.show();
        time2.show();
        time3.show();

    }
}