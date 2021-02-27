import java.io.FileReader;
import java.io.FileWriter;

/**
 * 文件字符流
 *
 * @Author: Jack Jparrow
 * @Date: 2021-02-02 17:48:59
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-02-02 18:53:54
 */

public class QZJT_JAVA_103 {

    public static void main(String[] args) {
        QZJT_JAVA_103.testFileReader("D:\\Desktop\\1.txt");
        QZJT_JAVA_103.testFileWriter("hello world", "D:\\Desktop\\3.txt");
        QZJT_JAVA_103.copyFile("D:\\Desktop\\3.txt", "D:\\Desktop\\3\\3.txt");
    }

    /**
     * 文件字符输入流
     * 
     * @param inPath
     */
    static void testFileReader(String inPath) {
        try {
            FileReader fr = new FileReader(inPath);// 创建字符输入流的对象

            char[] c = new char[10];// 创建临时存放数据的字符数组

            int len = 0;// 定义输入流的读长度

            while ((len = fr.read(c)) != -1) {
                System.out.println(new String(c, 0, len));
            }

            fr.close();// 关闭流
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 文件字符输出流
     * 
     * @param outpath
     */
    static void testFileWriter(String text/** 输出的内容 */
    ,String outpath) {
        try {
            FileWriter fw = new FileWriter(outpath);
            fw.write(text);// 写到内存中
            fw.flush();// 从内存写到硬盘中
            fw.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 字符流拷贝文件（仅限内容是字符的文件）
     * 
     * @param inpath
     * @param outpath
     */
    static void copyFile(String inpath, String outpath) {
        try {
            FileReader fr = new FileReader(inpath);
            FileWriter fw = new FileWriter(outpath);

            char[] c = new char[100];

            int len = 0;

            while ((len = fr.read(c)) != -1) {// 读取
                fw.write(c, 0, len);// 写入到内存
            }

            fw.flush();

            fw.close();
            fr.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}