package QZJT_JAVA_36.src;

/**
 * 封装与隐藏
 */
public class QZJT_JAVA_36 {
    public static void main(String[] args) {
        person p = new person();

        p.setAge(9);// 程序正确，但不符合正常逻辑
        // 这种情况，将类的属性开放，可随意使用
        p.getAge();
    }
}