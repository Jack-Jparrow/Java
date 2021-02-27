import java.io.File;

/**
 * File类递归遍历文件 遍历D盘文件夹下的Programing_language文件夹，直到文件全遍历出来，不论层级多深
 *
 * @Author: Jack Jparrow
 * @Date: 2021-01-29 17:05:35
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-01-29 17:30:22
 */

public class QZJT_JAVA_98 {

    /**
     * 递归遍历文件
     * 
     * @param file
     */
    void test_98(File file) {
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + "是一个文件");
        } else {
            System.out.println(file.getAbsolutePath() + "是一个文件夹");
            // 如果是文件夹，这个文件夹里就可能有子文件央或者文件
            File[] fs = file.listFiles();// 获取当前文件夹下的子文件夹或者文件的file对象
            if (fs != null && fs.length > 0) {
                for (File ff : fs) {
                    test_98(ff);// 递归
                }
            }
        }
    }

    public static void main(String[] args) {
        File f = new File("D:\\Programing_language");
        new QZJT_JAVA_98().test_98(f);
    }
}