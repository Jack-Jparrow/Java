/**
 * 设计一个接口Student,该接口描述的是本科生(StudentG)和硕士生(StudentM)的公共方法：
 * 设置姓名、学号，输出所有信息，判断学生是否优秀。 
 * 在该接口的基础上实现两个类StudentG和StudentM。
 * StudentG属性：姓名，学号，是否过CET4,上学年综合测评成绩。 
 * StudentG包含方法：构造方法，设置是否过CET4，设置上学年综合测评成绩，
 * 接口中定义的所有方法（本科生优秀的标准是过CET4，上学年综合测评成绩大于85分）。 
 * StudentM属性：姓名，学号，是否过CET6,已发表文章篇数。
 * StudentM包含方法：构造方法，设置是否过CET6，设置发表文章篇数， 
 * 接口中定义的所有方法（硕士生优秀的标准是过CET6，已发表文章篇数大于1）。
 * 要求： 
 * （1）实现上述的接口和类； 
 * （2）（在main函数内）实例化五个对象：三个本科生，两个硕士生（至少各有一个优秀）；
 * （3）用多态性来判断所实例化的五个学生是否优秀； 
 * （4）输出优秀学生的所有属性信息。
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-12 09:45:17
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-12 10:30:55
 */

interface Student {
    public void setName(String name);

    public void setID(String id);

    public void print();

    public void isYouxiu();
}

class StudentG implements Student {
    String name;
    String id;
    boolean CET4;
    int score;

    public StudentG(boolean CET4, int score) {
        this.CET4 = CET4;
        this.score = score;
    }

    @Override
    public void isYouxiu() {
        if (CET4 && score > 85) {
            System.out.println("姓名：" + name + " " + "优秀");
        } else {
            System.out.println("姓名：" + name + " " + "不优秀");
        }

    }

    @Override
    public void print() {
        System.out.print("姓名：" + name);
        System.out.print("  ");
        System.out.print("学号：" + id);
        System.out.print("  ");
        System.out.print("是否过CET4：" + CET4);
        System.out.print("  ");
        System.out.print("成绩：" + score);
        System.out.println();

    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void setID(String id) {
        this.id = id;

    }

}

class StudentM implements Student {

    String name;
    String id;
    boolean CET6;
    int article;

    public StudentM(boolean CET6, int article) {
        this.CET6 = CET6;
        this.article = article;
    }

    @Override
    public void isYouxiu() {
        if (CET6 && article >= 1) {
            System.out.println("姓名：" + name + " " + "优秀");
        } else {
            System.out.println("姓名：" + name + " " + "不优秀");
        }

    }

    @Override
    public void print() {
        System.out.print("姓名：" + name);
        System.out.print("  ");
        System.out.print("学号：" + id);
        System.out.print("  ");
        System.out.print("是否过CET6：" + CET6);
        System.out.print("  ");
        System.out.print("发表文章数：" + article);
        System.out.println();

    }

    @Override
    public void setID(String id) {
        this.id = id;

    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

}

public class qm6 {

    public static void main(String[] args) {
        StudentG sg1 = new StudentG(true, 88);
        StudentG sg2 = new StudentG(false, 88);
        StudentG sg3 = new StudentG(true, 84);
        sg1.setName("张三");
        sg1.setID("2019001");
        sg2.setName("张四");
        sg2.setID("2019002");
        sg3.setName("张五");
        sg3.setID("2019003");

        StudentM sm1 = new StudentM(true, 1);
        StudentM sm2 = new StudentM(false, 1);
        sm1.setName("李四");
        sm1.setID("2019201");
        sm2.setName("李五");
        sm2.setID("2019202");

        sg1.isYouxiu();
        sg2.isYouxiu();
        sg3.isYouxiu();
        sm1.isYouxiu();
        sm2.isYouxiu();

        sg1.print();
        sg2.print();
        sg3.print();
        sm1.print();
        sm2.print();
    }
}