import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 字节流复制文件
 *
 * @Author: Jack Jparrow
 * @Date: 2021-02-02 17:11:04
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-02-02 17:21:34
 */

public class QZJT_JAVA_101 {

    public static void main(String[] args) {
        QZJT_JAVA_101.copyFile();
    }

    static void copyFile() {
        try {
            FileInputStream in = new FileInputStream("D:\\Desktop\\1.txt");// 从指定位置读取
            FileOutputStream out = new FileOutputStream("D:\\Desktop\\3\\1.txt");// 复制到指定位置

            byte[] b = new byte[100];
            int len = 0;

            while ((len = in.read(b)) != -1) {
                out.write(b/** 缓冲byte数组 */, 0/** 从数组哪一位读起 */, len/** 数组总长度 */);
            }

            out.flush();
            out.close();
            in.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}