/**
 * 工厂模式
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-08 07:35:51
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-08 08:02:13
 */

// 产品接口
interface BWM {
    void showINfo();
}

// 具体的类
class BWM3a implements BWM {

    @Override
    public void showINfo() {
        System.out.println("这是BWM3");
    }

}

class BWM5 implements BWM {

    @Override
    public void showINfo() {
        System.out.println("这是BWM5");
    }

}

class BWM7 implements BWM {

    @Override
    public void showINfo() {
        System.out.println("这是BWM7");
    }

}

// 汽车生产工厂接口
interface BWMFactory {
    BWM productBWM();
}

// 实现具体车型的生产
class BWM3Factory implements BWMFactory {

    @Override
    public BWM productBWM() {
        System.out.println("生产BWM3");
        System.out.println("改造BWM3");

        return new BWM3a();
    }

}

class BWM5Factory implements BWMFactory {

    @Override
    public BWM productBWM() {
        System.out.println("生产BWM5");

        return new BWM5();
    }

}

class BWM7Factory implements BWMFactory {

    @Override
    public BWM productBWM() {
        System.out.println("生产BWM7");

        return new BWM7();
    }

}

// 以上为开发者A的工作

public class QZJT_JAVA_71 {

    public static void main(String[] args) {
        // 这是开发者B的工作
        BWM b3 = new BWM3Factory().productBWM();
        b3.showINfo();

        BWM b5 = new BWM5Factory().productBWM();
        b5.showINfo();

        BWM b7 = new BWM7Factory().productBWM();
        b7.showINfo();
    }
}