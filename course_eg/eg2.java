import java.util.*;

class Student{
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class eg2{
	public static void main(String[] args){
		Student stu1 = new Student("张三", 10);
		Student stu2 = new Student("张四", 9);
		Student stu3 = new Student("张五", 13);
		Student stu4 = new Student("张六", 12);
		
//		System.out.println(stu1);
		
		List<Student> list = new ArrayList<Student>();
		list.add(stu1);
		list.add(0, stu2);
		list.add(stu3);
		list.add(2, stu4);
		
		System.out.println(list.size() + "个学生");
		
		for(int i = 0; i < list.size(); i++){
			Student stu = (Student)list.get(i);
			System.out.println(stu.getName() + " " + stu.getAge());
		}
		
	}
}