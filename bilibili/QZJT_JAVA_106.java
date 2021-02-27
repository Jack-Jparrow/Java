import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 转换输入流
 *
 * @Author: Jack Jparrow
 * @Date: 2021-02-27 09:52:17
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-02-27 10:10:04
 */

public class QZJT_JAVA_106 {

    public static void main(String[] args) {
        try {
            QZJT_JAVA_106.testInputStreamReader();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 转换输入流InputStreamReader 
     * 注意，在转换字符流时，设置的字符集编码要与读取文件数据的编码一致，否则会乱码
     * 
     * @throws Exception
     */
    static void testInputStreamReader() throws Exception {
        FileInputStream fs = new FileInputStream("D:\\Desktop\\1.txt");

        // 字节流转换为字符流
        InputStreamReader in = new InputStreamReader(fs, "utf-8");// 参数1是字节流，参数2是编码

        char[] c = new char[100];
        int len = 0;

        while ((len = in.read(c)) != -1) {
            System.out.println(new String(c, 0, len));
        }

        in.close();
        fs.close();
    }
}