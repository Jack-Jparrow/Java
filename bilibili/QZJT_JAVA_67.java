/**
 * 抽象类
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-06 18:51:26
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-06 19:14:38
 */
abstract class Employee {
    String name;
    String id;
    double salary;

    public Employee() {

    }

    public abstract void work();
}

class Manager extends Employee {
    double bonus;

    public void setManagerInfo(String name, String id, double salary, double bonus) {
        super.id = id;
        super.name = name;
        super.salary = salary;
        this.bonus = bonus;
    }

    public void getManagerInfo() {
        System.out.println(super.name);
        System.out.println(super.id);
        System.out.println(super.salary);
        System.out.println(this.bonus);
    }

    @Override
    public void work() {
        System.out.println("这是一个领导");
    }
}

class CommonEmployee extends Employee {

    public void setCommonEmployeeInfo(String name, String id, double salary) {
        super.id = id;
        super.name = name;
        super.salary = salary;
    }

    public void getCommonEmployeeInfo() {
        System.out.println(super.name);
        System.out.println(super.id);
        System.out.println(super.salary);
    }

    @Override
    public void work() {
        System.out.println("这是普通员工");
    }
}

public class QZJT_JAVA_67 {

    public static void main(String[] args) {
        Manager e = new Manager();
        e.work();
        e.setManagerInfo("张三", "123", 10000, 1000);
        e.getManagerInfo();

        System.out.println();

        CommonEmployee ce = new CommonEmployee();
        ce.work();
        ce.setCommonEmployeeInfo("李四", "123456", 5000);
        ce.getCommonEmployeeInfo();
    }
}
