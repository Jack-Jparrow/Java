/**
 * Class类
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-03 14:45:13
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-03 15:06:21
 */

public class QZJT_JAVA_113 {

    public static void main(String[] args) {
        Person_113 p = new Person_113();
        Class clazz = p.getClass();// clazz对象中就包含对象p所属的Person_113类的所有的信息

        Class c0 = Person_113.class;// 通过类名.class创建指定类的Class实例

        Class c1 = p.getClass();// 通过一个类的实例对象的getClass()方法获取对应实例对象的类的Class实例

        try {
            // 通过class的静态方法forName(string className)来获取一个类的Class实例
            // forName(string className)方法中的参数是要获取的Class实例的类的全路径(包名.类名)
            Class c2 = Class.forName("Person_113");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Person_113 {
    String name;
    int age;
}