import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 对象流
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-02 15:01:58
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-02 15:15:39
 */

class Person_111 implements Serializable {

    /**
     * 表示序列化版本标识符的静态变量 
     * 表明类的不同版本间的兼容性
     */
    private static final long serialVersionUID = 1L;

    String name;
    int age;

}

public class QZJT_JAVA_111 {

    public static void main(String[] args) {
        try {
            // QZJT_JAVA_111.testSerialize();
            QZJT_JAVA_111.testDeserialize();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
     * 对象的序列化
     * 
     * @throws Exception
     */
    static void testSerialize() throws Exception {

        // 定义对象的输出流，把对象序列化后的流放入指定文件中
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\Desktop\\1.txt"));

        Person_111 p = new Person_111();
        p.name = "张三";
        p.age = 18;

        out.writeObject(p);
        out.flush();// 写入硬盘

        out.close();
    }

    /**
     * 对象的反序列化
     * 
     * @throws Exception
     */
    static void testDeserialize() throws Exception {

        // 创建对象输入流对象，从指定文件中读取对象序列化后的流
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\Desktop\\1.txt"));

        Object obj = in.readObject();

        Person_111 p = (Person_111) obj;

        System.out.println(p.name);
        System.out.println(p.age);

        in.close();
    }
}