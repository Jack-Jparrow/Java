/**
 * 提取字符串每个单词
 */
import java.util.StringTokenizer;

class Token {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("I am a Java newer");
        String[] tokens = new String[st.countTokens()];// 声明定义数组
        
        for (int i = 0; st.hasMoreTokens(); i++)// 每个数组元素存放一个单词
        {
            tokens[i] = st.nextToken();// 取词
            
            System.out.println(tokens[i]);// 打印
        }
    }
}
