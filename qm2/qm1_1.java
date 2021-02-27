/**
 * 定义一个人类(Person),描述该类的姓名、年龄、身高、体重的特征，
 * 定义一个方法(check)来检验人的体重是否在正常范围内，再定义一个方法(out)用于输出个人资料。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-15 18:35:46 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-20 19:28:59
 */
class Person1{
    public Person1(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    String name;
    int age;
    double weight;
    double height;

    public void check() {
        double res = weight / (height * height);
        System.out.printf("体重指数：%.2f%n", res);

        if (res >= 18 && res <= 25) {
            System.out.println("正常");
        }else if(res < 18){
            System.out.println("偏瘦");
        }else{
            System.out.println("偏胖");
        }
    }

    public void out(){
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age + " 岁");
        System.out.println("体重：" + weight + " kg");
        System.out.println("身高：" + height + " m");
    }
}

public class qm1_1 {

    public static void main(String[] args) {
        Person1 p = new Person1("张三", 20, 1.7, 65.6);

        p.out();
        p.check();

    }
}