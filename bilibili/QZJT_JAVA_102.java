import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 文件字节流复制文件到指定位置
 *
 * @Author: Jack Jparrow 
 * @Date: 2021-02-02 17:23:03 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-02-02 17:30:45
 */

public class QZJT_JAVA_102 {

    public static void main(String[] args) {
        QZJT_JAVA_102.copyFile("D:\\Desktop\\1.png", "D:\\Desktop\\3\\1.png");
    }

    static void copyFile(String inPath, String outPath) {
        try {
            FileInputStream in = new FileInputStream(inPath);// 从指定位置读取
            FileOutputStream out = new FileOutputStream(outPath);// 复制到指定位置

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