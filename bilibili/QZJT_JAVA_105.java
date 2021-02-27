import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 缓冲字符流
 *
 * @Author: Jack Jparrow
 * @Date: 2021-02-04 14:49:25
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-02-04 16:39:16
 */

public class QZJT_JAVA_105 {

    public static void main(String[] args) {
        try {
            QZJT_JAVA_105.testBufferedReader();
            QZJT_JAVA_105.testBufferedWriter();
            QZJT_JAVA_105.copyFile();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 缓冲字符输入流
     * 
     * @throws Exception
     */
    static void testBufferedReader() throws Exception {
        FileReader fr = new FileReader("D:\\Desktop\\1.txt");

        BufferedReader br = new BufferedReader(fr);

        char[] c = new char[100];

        int len = 0;

        while ((len = br.read(c)) != -1) {
            System.out.println(new String(c, 0, len));
        }

        br.close();
        fr.close();
    }

    /**
     * 缓冲字符输出流
     * 
     * @throws Exception
     */
    static void testBufferedWriter() throws Exception {
        FileWriter fw = new FileWriter("D:\\Desktop\\2.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        String s = "hello world";

        bw.write(s);
        bw.flush();

        bw.close();
        fw.close();
    }

    /**
     * 复制文件
     * @throws Exception
     */
    static void copyFile() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Desktop\\1.txt"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Desktop\\3.txt"));

        char[] c = new char[100];

        int len = 0;

        while ((len = br.read(c)) != -1) {
            bw.write(c, 0, len);
        }

        bw.flush();

        bw.close();
        br.close();
    }

}