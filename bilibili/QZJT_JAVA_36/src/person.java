package QZJT_JAVA_36.src;

/**
 * 封装与隐藏
 */
public class person {

    private int age;// 这种情况，将类的属性开放，可随意使用
    //对这种不能随意使用的属性需要封装与隐藏，改成private

    int age2;
/*     public void printAge() {

        System.out.println(age);
    } */
    public int getAge() {
        System.out.println(age);
        System.out.println(age2);
        return age;
    }

    public void setAge(int a) {
        if (a >= 0 && a <=150) {
            age = a;
            age2 = a;
        }else{
            System.out.println(a + " illegal");
        }
    }
}