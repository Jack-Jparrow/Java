import java.io.RandomAccessFile;

/**
 * 随机存取流
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-02 15:25:01
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-02 15:52:25
 */

public class QZJT_JAVA_112 {

    public static void main(String[] args) {
        try {
            // QZJT_JAVA_112.testRandomAccessFileRead();
            QZJT_JAVA_112.testRandomAccessFileWrite();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 随机读文件
     * 
     * @throws Exception
     */
    static void testRandomAccessFileRead() throws Exception {

        // 参数1是文件路径，参数2是指定RandomAccessFile的访问模式
        RandomAccessFile ra = new RandomAccessFile("D:\\Desktop\\2.txt", "r");

        ra.seek(0);// 设置文件内容的起始点（字节数），可实现文件任意位置读取

        byte[] b = new byte[1024];

        int len = 0;

        while ((len = ra.read(b)) != -1) {
            System.out.println(new String(b, 0, len));

        }

        ra.close();
    }

    /**
     * 随机写
     * @throws Exception
     */
    static void testRandomAccessFileWrite() throws Exception{

        // 参数1是文件路径，参数2是指定RandomAccessFile的访问模式
        RandomAccessFile ra = new RandomAccessFile("D:\\Desktop\\2.txt", "rw");

        // 设置文件内容的起始点（字节数），可实现文件任意位置写入
        // 0表示从头开始，ra.length()表示从文件最后写，也就是追加
        ra.seek(0);

        ra.write("你好".getBytes());

        ra.close();
    }
}