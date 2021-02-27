/**
 * equals
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-05 07:55:33
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-05 08:29:46
 */
public class QZJT_JAVA_55 {

    public static class Person {

    }

    public static void main(String[] args) {
        int i = 65;
        float f1 = 65.0f;
        char ch1 = 'A';
        char ch2 = 12;
        String str1 = new String("hello");
        String str2 = new String("hello");
        String s1 = new String("abc");
        String s2 = new String("abc");
        // System.out.println(i == 3);

        Person p1 = new Person();
        Person p2 = new Person();
        // Person p3 = new Person();
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        
        System.out.println("65 = 65.0? " + (i == f1));
        System.out.println("65 = 'A'? " + (i == ch1));
        System.out.println("12 = ch2? " + (12 == ch2));
        System.out.println("str1 = str2? " + str1 == str2);
        System.out.println("str1 equals str2? " + (str1.equals(str2)));
        // System.out.println("hello" == new java.sql.Date());
    }
}