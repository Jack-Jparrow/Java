import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * 把控制台输入的内容写到指定的TXT文件中 当接收到字符串over时结束
 *
 * @Author: Jack Jparrow
 * @Date: 2021-02-28 17:09:05
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-02-28 17:22:42
 */

public class QZJT_JAVA_109 {

    public static void main(String[] args) {
        try {
            QZJT_JAVA_109.writeToTxt();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    static void writeToTxt() throws Exception {
        // 创建接受键盘输入数据的输入流
        InputStreamReader is = new InputStreamReader(System.in);

        // 将输入流放入缓冲流
        BufferedReader br = new BufferedReader(is);

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Desktop\\1.txt"));

        String str = "";

        while ((str = br.readLine()) != null) {
            if (str.equals("over")) {
                break;
            }

            // 读取的每一行写入到指定的txt文件中
            bw.write(str);
        }

        bw.flush();

        bw.close();
        br.close();
        is.close();
    }
}