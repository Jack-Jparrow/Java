import java.io.File;
import java.io.IOException;

/**
 * File类
 *
 * @Author: Jack Jparrow
 * @Date: 2021-01-29 15:15:36
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-01-29 16:00:33
 */

public class QZJT_JAVA_97 {

    public static void main(String[] args) {
        File f = new File("‪D:\\Desktop\\12.txt");// 此时对象f就是这个文件
        // File f1 = new File("‪D:\\Desktop", "12.txt");// 上面一样，不常用
        // File f2 = new File("‪D:/Desktop//12.txt");// 上面一样，不常用
        // File f3 = new File("‪D:" + File.separator + "Desktop\\12.txt");// 上面一样，不常用
        File f4 = new File("‪D:\\Desktop");
        File f5 = new File("Desktop\\12.txt");// 相对路径

        System.out.println(f.getName());// 获取文件名
        System.out.println(f4.getName());// 获取文件本级目录名
        System.out.println(f.getPath());// 获取new时候的路径
        System.out.println(f.getAbsolutePath());// 获取绝对路径
        System.out.println(f5.getPath());// 获取new时候的路径
        System.out.println(f5.getAbsolutePath());// 获取绝对路径
        System.out.println(f5);
        System.out.println(f5.getAbsoluteFile());// 返回用当前文件绝对路径构建的file对象
        System.out.println(f5.getParent());// 返回上一级路径

        // f.renameTo(new File("D:\\Desktop\\123.txt"));//重命名

        File f6 = new File("‪D:\\Desktop\\12.txt");

        System.out.println(f6.exists());// 判断文件或文件夹是否存在
        System.out.println(f6.canWrite());// 判断文件是否可写
        System.out.println(f6.canRead());// 判断文件是否可读
        System.out.println(f6.isFile());// 判断当前对象是否为文件
        System.out.println(f6.isDirectory());// 判断当前对象是否为文件夹或目录
        System.out.println(f6.lastModified());// 最后修改时间（毫秒数）
        System.out.println(f6.length());// 返回文件长度（单位：字节数）

        File f7 = new File("‪‪D:\\Desktop\\125.txt");

        System.out.println(f7.exists());

        if (!f7.exists()) {
            try {
                f7.createNewFile();// 新建文件
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        f.delete();// 删除文件

        File f8 = new File("‪‪D:\\Desktop\\125");

        f8.mkdir();// 新建单层目录

        File f9 = new File("‪‪D:\\Desktop\\1\\2\\3");

        f9.mkdirs();// 创建多级目录

        File f10 = new File("‪‪D:\\Desktop");

        String[] fl = f10.list();// 返回当前文件夹的子集的名称，包括目录和文件
        File[] fl1 = f10.listFiles();// 返回当前文件夹的子集的File对象，包括目录和文件

        for (String s : fl) {
            System.out.println(s);
        }

        for (File s1 : fl1) {
            System.out.println(s1);
        }

    }
}