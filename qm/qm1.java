/**
 * 定义一个人类（Person),描述该类的姓名、年龄、身高、体重的特征，
 * 定义一个方法(check)来检验人的体重是否在正常范围内，再定义一个方法(out)用于输出个人资料。
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-12 07:00:31
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-12 07:20:39
 */
class Person {

    public Person(String name, int age, double height, double weight) {

        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    String name;
    int age;
    double height;
    double weight;
    double res;

    public void check() {
        res = weight / (height * height);
        System.out.println("指数：" + this.res);

        if (res >= 18 && res <= 25) {
            System.out.println("正常");
        }else if(res < 18){
            System.out.println("偏瘦");
        }else{
            System.out.println("偏胖");
        }
    }

    public void out() {
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
        System.out.println("身高：" + this.height + "（米）");
        System.out.println("体重：" + this.weight + "（千克）");
        
    }
}

public class qm1 {

    public static void main(String[] args) {
        Person p = new Person("张三", 20, 1.7, 60);
        p.out();
        p.check();
    }
}