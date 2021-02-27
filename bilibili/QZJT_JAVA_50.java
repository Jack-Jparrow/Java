/**
 * 多态
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-02 20:32:43
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-02 20:51:37
 */
// class Person {
//     int age;
//     String name;
//     String sex;

//     public void showInfo() {
//         System.out.println(this.age);
//         System.out.println(this.name);
//         System.out.println(this.sex);
//     }

//     public void setInfo() {
//         this.age = age;
//         this.name = name;
//         this.sex = sex;
//     }
// }

// class Student extends Person {
//     String school;

//     @Override
//     public void showInfo() {
//         System.out.println(this.age);
//         System.out.println(this.name);
//         System.out.println(this.sex);
//     }
// }

// public class QZJT_JAVA_50 {

//     public static void main(String[] args) {
//         /**
//          * 正常写法 
//          * Person p = new Person(); 
//          * Student e = new Student();
//          */

//         Person p = new Student();// 用父类的引用对象指向子类的实例
//         /* 
//         Person p = new Person();
//         p = new Student();
//          */
//     }
// }
