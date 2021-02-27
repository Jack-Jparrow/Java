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
 * @Date: 2020-12-15 19:44:30 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-16 07:15:31
 */
interface Student6_1{
    public void setName(String name);
    public void setId(int id);
    public void print();
    public void isYouxiu();
}

class StudentG6_1 implements Student6_1{

    String name;
    int id;
    boolean CET4;
    double score;

    public StudentG6_1(boolean CET4, double score){
        this.CET4 = CET4;
        this.score =score;
    }

	@Override
	public void isYouxiu() {
		if (CET4 && score > 85) {
            System.out.println("姓名：" + name + "  优秀");
        }else{
            System.out.println("姓名：" + name + "  不优秀");
        }
	}

	@Override
	public void print() {
        System.out.print("姓名：" + name);
        System.out.print("    学号：" + id);
        System.out.print("    成绩：" + score);
        System.out.print("    是否过CET4：" + CET4);
        System.out.println();
		
	}

	@Override
	public void setId(int id) {
		this.id = id;
		
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}
    
}

class StudentM6_1 implements Student6_1{

    String name;
    int id;
    boolean CET6;
    int article;

    public StudentM6_1(boolean CET6, int article){
        this.CET6 = CET6;
        this.article = article;
    }

	@Override
	public void isYouxiu() {
		if (CET6 && article > 1) {
            System.out.println("姓名：" + name + "  优秀");
        }else{
            System.out.println("姓名：" + name + "  不优秀");
        }
	}

	@Override
	public void print() {
        System.out.print("姓名：" + name);
        System.out.print("    学号：" + id);
        System.out.print("    文章数：" + article);
        System.out.print("    是否过CET6：" + CET6);
        System.out.println();
		
	}

	@Override
	public void setId(int id) {
		this.id = id;
		
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}
    
}

public class qm6_1 {

    public static void main(String[] args) {
        StudentG6_1 st1 = new StudentG6_1(true, 90);
        StudentG6_1 st2 = new StudentG6_1(true, 84);
        StudentG6_1 st3 = new StudentG6_1(false, 90);
        StudentM6_1 sm1 = new StudentM6_1(true, 2);
        StudentM6_1 sm2 = new StudentM6_1(true, 0);

        st1.setName("张三");
        st1.setId(20190001);
        st2.setName("张四");
        st2.setId(20190002);
        st3.setName("张五");
        st3.setId(20190003);
        sm1.setName("李四");
        sm1.setId(20191001);
        sm2.setName("李五");
        sm2.setId(20191002);

        st1.print();
        sm1.print();


        st1.isYouxiu();
        st2.isYouxiu();
        st3.isYouxiu();
        sm1.isYouxiu();
        sm2.isYouxiu();

    }
}