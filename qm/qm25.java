/**
 * 定义水果父类，
 * 具有“名称”、“重量”属性和“输出”方法；
 * 定义苹果子类，分别继承父类的属性和方法，并增加本身的方法。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-14 09:25:03 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-14 09:42:37
 */

class Fruit{
    String name;
    double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void print() {
        System.out.println(name);
        System.out.println(weight + "克");
    }

}

class Apple extends Fruit{
    String type;
    
    public void printType() {
        System.out.println(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

public class qm25 {

    public static void main(String[] args) {
        Apple a = new Apple();
        a.setName("苹果");
        a.setWeight(250);
        a.setType("红富士");

        a.print();
        a.printType();
    }
}