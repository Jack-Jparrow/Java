import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 数据流
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-01 15:02:02
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-01 15:21:43
 */

public class QZJT_JAVA_110 {

    public static void main(String[] args) {
        try {
            // QZJT_JAVA_110.testDateOutputStream();
            QZJT_JAVA_110.testDateInputStream();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 数据输出流 
     * 用数据输出流写到文件中的基本数据类型的数据是乱码的，需要数据输入流读取 
     * DataOutputStream
     * 
     * @throws Exception
     */
    static void testDateOutputStream() throws Exception {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\Desktop\\1.txt"));
        // out.writeBoolean(true);
        out.writeDouble(1.66d);
        // out.writeInt(100);

        out.flush();
        out.close();
    }

    /**
     * 数据输入流
     * 用数据输出流写到文件中的基本数据类型的数据是乱码的，需要数据输入流读取 
     * 用数据输入流读取数据输出流写到文件中的数据时，要保证使用和当时写的数据类型一致的类型来读取
     * DataInputStream
     * 
     * @throws Exception
     */
    static void testDateInputStream() throws Exception {
        DataInputStream in = new DataInputStream(new FileInputStream("D:\\Desktop\\1.txt"));

        System.out.println(in.readDouble());

        in.close();
    }
}