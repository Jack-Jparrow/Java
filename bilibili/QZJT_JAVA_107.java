import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 转换输出流
 *
 * @Author: Jack Jparrow
 * @Date: 2021-02-27 10:10:31
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-02-27 10:15:12
 */

public class QZJT_JAVA_107 {

    public static void main(String[] args) {
        try {
            QZJT_JAVA_107.testOutPutStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 转换输入流OutputStreamWriter 
     * 注意，在转换字符流时，设置的字符集编码要与读取文件数据的编码一致，否则会乱码
     * 
     * @throws Exception
     */
    static void testOutPutStream() throws Exception {
        FileOutputStream out = new FileOutputStream("D:\\Desktop\\1.txt");

        OutputStreamWriter os = new OutputStreamWriter(out, "utf-8");

        os.write("发电房");
        os.flush();

        os.close();
        out.close();

    }
}