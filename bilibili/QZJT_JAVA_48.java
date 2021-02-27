/**
 * 方法的重写
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-02 08:40:14
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-02 14:56:05
 */
class Mankind1 {
    int sex;// 男：1；女：0
    int salary;// 有工作：1；没工作：0

    public void manOrWoman() {
        if (sex == 1) {
            System.out.println("man");
        } else {
            System.out.println("woman");
        }
    }

    public void employed() {
        if (salary == 0) {
            System.out.println("no job");
        } else {
            System.out.println("job");
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

class Kids1 extends Mankind1 {
    int yearsOld;

    @Override
    public void employed() {
        System.out.println("Kids1 should study and no job.");
    }

    public void printAge() {
        System.out.println(this.yearsOld);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

}

public class QZJT_JAVA_48 {

    public static void main(String[] args) {
        Kids1 someKid = new Kids1();
        someKid.setSalary(0);
        someKid.setSex(1);
        someKid.setYearsOld(20);

        someKid.manOrWoman();
        someKid.employed();
        someKid.printAge();
    }
}
