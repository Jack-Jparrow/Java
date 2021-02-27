/**
 * 定义水果父类，
 * 具有“名称”、“重量”属性和“输出”方法；
 * 定义苹果子类，分别继承父类的属性和方法，并增加本身的方法。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-17 17:40:31 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-17 17:54:44
 */

class Fruit25_1{
    
    String name;
    double weight;
    
    public void out(){
        System.out.println("名称：" + name);
        System.out.println("重量：" + weight);
    }

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

}

class Apple25_1 extends Fruit25_1{

    String place;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void outPlace() {
        System.out.println("产地：" + place);
    }

    
}

public class qm25_1 {

    public static void main(String[] args) {
        Apple25_1 a = new Apple25_1();
        a.setName("红富士");
        a.setWeight(200);
        a.setPlace("山东");

        a.out();
        a.outPlace();
    }
}