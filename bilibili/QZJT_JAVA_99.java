import java.io.FileInputStream;
/**
 * 文件字节流
 *
 * @Author: Jack Jparrow
 * @Date: 2021-02-02 16:44:47
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-02-02 17:10:43
 */

public class QZJT_JAVA_99 {

    public static void main(String[] args) {
        QZJT_JAVA_99.testFileInputStream(); 
    }

    /**
     * 文件字节输入流
     */
    static void testFileInputStream() {
        try {
            FileInputStream in = new FileInputStream("D:\\Desktop\\1.txt");

            byte[] b = new byte[10];// 设置byte数组接受文件的内容
            int len = 0;// 数据长度

            // in.read(b);
            // 有一个返回值返回读取数据的长度，读取到最后一个数据则继续向后读一个，此时返回-1
            // 即：当返回-1，则表示文件读完

            while ((len = in.read(b)) != -1) {
                System.out.println(new String(b/** 缓冲byte数组 */, 0/** 从数组哪一位读起 */, len/** 具体读了多少数据 */));
            }

            in.close();// 流在使用完一定要关闭

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}