import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 标准输入输出流
 *
 * @Author: Jack Jparrow
 * @Date: 2021-02-28 17:02:13
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-02-28 17:10:49
 */

public class QZJT_JAVA_108 {

    public static void main(String[] args) {
        try {
            QZJT_JAVA_108.testSystemIn();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 标准输入流
     * @throws Exception
     */
    static void testSystemIn() throws Exception {

        // 创建接受键盘输入数据的输入流
        InputStreamReader is = new InputStreamReader(System.in);

        // 将输入流放入缓冲流
        BufferedReader br = new BufferedReader(is);

        String str = "";// 定义临时接受数据的字符串

        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }

        br.close();
        is.close();
    }
}