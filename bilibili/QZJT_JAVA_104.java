import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 缓冲字节流
 *
 * @Author: Jack Jparrow
 * @Date: 2021-02-03 14:59:40
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-02-03 19:31:04
 */

public class QZJT_JAVA_104 {

    public static void main(String[] args) {
        try {
            QZJT_JAVA_104.testBufferedInputStream();
            QZJT_JAVA_104.testBufferedOutputStream();
            QZJT_JAVA_104.copyFile();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 缓冲字节输入流
     */
    static void testBufferedInputStream() throws Exception {
        // 文件字节输入流对象
        FileInputStream in = new FileInputStream("D:\\Desktop\\1.txt");

        // 把文件字节输入流放入缓冲字节输入流对象
        BufferedInputStream br = new BufferedInputStream(in);

        byte[] b = new byte[1024];

        int len = 0;

        while ((len = br.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }

        br.close();
        in.close();
    }

    /**
     * 缓冲字节输出流
     * 
     * @throws FileNotFoundException
     */
    static void testBufferedOutputStream() throws Exception {
        // 创建字节输出流对象
        FileOutputStream out = new FileOutputStream("D:\\Desktop\\2.txt");

        // 把文件字节输出流放入缓冲字节输出流对象
        BufferedOutputStream bo = new BufferedOutputStream(out);

        String s = "hello world";

        bo.write(s.getBytes());// 写到内存
        bo.flush();// 写到硬盘

        bo.close();
        out.close();
    }

    /**
     * 缓冲流实现文件复制
     */
    static void copyFile() throws Exception {
        //缓冲输入流
        BufferedInputStream br = new BufferedInputStream(new FileInputStream("D:\\Desktop\\1.txt"));

        //缓冲输出流
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("D:\\Desktop\\2\\1.txt"));

        byte[] b = new byte[1024];

        int len = 0;

        while ((len = br.read(b)) != -1) {
            bo.write(b, 0, len);//写入内存
        }

        bo.flush();

        bo.close();
        br.close();

    }
}