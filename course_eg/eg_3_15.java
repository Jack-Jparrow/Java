/**
 * ��ȡ�ַ���ÿ������
 */
import java.util.StringTokenizer;

class Token {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("I am a Java newer");
        String[] tokens = new String[st.countTokens()];// ������������
        
        for (int i = 0; st.hasMoreTokens(); i++)// ÿ������Ԫ�ش��һ������
        {
            tokens[i] = st.nextToken();// ȡ��
            
            System.out.println(tokens[i]);// ��ӡ
        }
    }
}
