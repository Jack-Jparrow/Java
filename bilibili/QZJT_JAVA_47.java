/**
 * 继承
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-02 07:24:27
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-02 07:47:29
 */
class Mankind {
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

class Kids extends Mankind {
    int yearsOld;

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

public class QZJT_JAVA_47 {

    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.setSalary(0);
        someKid.setSex(1);
        someKid.setYearsOld(20);

        someKid.manOrWoman();
        someKid.employed();
        someKid.printAge();
    }
}