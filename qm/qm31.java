/**
 * 设计一个抽象类Shape, 
 * 属性为x和y，表示圆心坐标，
 * 计算面积的抽象方法double area()，
 * 并设计一个计算圆心距离坐标原点距离的方法distance(double x ,double y)；
 * 在Shape类的基础上设计子类，
 * 分别是圆Circle和正方形Square,
 * 其属性分别为半径r和边长l，
 * 都具有求面积的方法。
 * 设计一个测试类Test，
 * 创建Circle和Square的对象c和s,
 * 使c的半径为5，s的边长为10，
 * 求出面积并显示出来。
 * 当圆心坐标为（3，4）的时候，
 * 求圆心距离坐标原点距离并显示出来。
 * 注：开平方的方法Math.sqrt(double x)；
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-14 19:06:10 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-17 18:39:54
 */
abstract class Shape{
    double x;
    double y;

    abstract double area();
    abstract double distance(double x ,double y);
}

class Circle extends Shape{
    int r;

    @Override
    double area() {
        return (r *r * Math.PI);
    }

    @Override
    double distance(double x, double y) {
        super.x = x;
        super.y = y;
        return (Math.sqrt(x * x + y * y));
    }

}

class Square extends Shape{
    int l;

    @Override
    double area() {
        return (double)(l * l);
    }

    @Override
    double distance(double x, double y) {
        // TODO Auto-generated method stub
        return 0;
    }

}

public class qm31 {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.r = 5;
        System.out.println("圆的面积是：" + c.area());

        Square s = new Square();
        s.l = 10;
        System.out.println("正方形的面积是：" + s.area());

        System.out.println("圆心距离坐标原点的距离：" + c.distance(3, 4));
    }
}