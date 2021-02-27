/**
 * 抽象类
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-06 18:28:06
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-06 18:39:57
 */
abstract class Animal {
    public abstract void test();

    public abstract void move();
}

class Dog extends Animal {
    @Override
    public void test() {
        // UnsupportedOperationException
    }

    @Override
    public void move() {
        System.out.println("狗：跑");
    }
}

class Fish extends Animal {
    @Override
    public void test() {
        // UnsupportedOperationException
    }

    @Override
    public void move() {
        System.out.println("鱼：游");
    }
}

abstract class Birds extends Animal {

    @Override
    public void move() {

    }

    public abstract void test();
}

public class QZJT_JAVA_66 {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.move();

        Fish f = new Fish();
        f.move();
    }
}