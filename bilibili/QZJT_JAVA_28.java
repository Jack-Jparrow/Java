/**
 * 教师和学生信息
 */
public class QZJT_JAVA_28 {

    public String name;
    public int age;
    public String course;
    public String hobby;
    public int tecAge;
    public String profession;

    /***
     * 学生
     */
    public void student() {
        // QZJT_JAVA_28 student = new QZJT_JAVA_28();

        /*
         * student.name = "张三"; student.age = 20; student.course = "Java"; student.hobby
         * = "noding";
         */

        System.out.println("↓学生↓");
        System.out.println("姓名：" + name + " " + "年龄：" + age + " " + "课程：" + course + " " + "兴趣：" + hobby);
    }

    /**
     * 教师
     */
    public void teacher() {
        // QZJT_JAVA_28 teacher = new QZJT_JAVA_28();

        /*
         * teacher.name = "李四"; teacher.profession = "Web"; teacher.course = "Java";
         * teacher.tecAge = 10;
         */

        System.out.println("↓教师↓");
        System.out.println("姓名：" + name + " " + "专业：" + profession + " " + "教授课程：" + course + " " + "教龄" + tecAge);
    }

    public static void main(String[] args) {
        // QZJT_JAVA_28 o = new QZJT_JAVA_28();
        QZJT_JAVA_28 o1 = new QZJT_JAVA_28();
        QZJT_JAVA_28 o2 = new QZJT_JAVA_28();

        o1.name = "张三";
        o1.age = 20;
        o1.course = "Java";
        o1.hobby = "coding";

        o2.name = "李四";
        o2.profession = "Web";
        o2.course = "Java";
        o2.tecAge = 10;

        o1.student();
        o2.teacher();
    }
}