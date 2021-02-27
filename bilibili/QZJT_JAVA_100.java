import java.io.FileOutputStream;

/**
 * 文件字节流
 *
 * @Author: Jack Jparrow
 * @Date: 2021-02-02 17:01:38
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-02-02 17:07:55
 */

public class QZJT_JAVA_100 {

	public static void main(String[] args) {
		QZJT_JAVA_100.testFileOutputStream();
	}

	/**
	 * 文件字节输出流
	 */
	static void testFileOutputStream() {
		try {
			FileOutputStream out = new FileOutputStream("D:\\Desktop\\2.txt");// 指定输出位置
			String str = "asfgsdfasdfasdfwdfas";
			
			out.write(str.getBytes());// 把数据写入内存
			out.flush();// 把内存中数据写到硬盘
			out.close();// 关闭
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
