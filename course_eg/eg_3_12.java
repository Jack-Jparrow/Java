/**
 * 截取字符串
 */
class eg_3_12 {
    public static void main(String args[]) {
        String s = "This is a getChars method.";
        int start = 10;// 第一个字符的位置（索引）为0，10代表第11个字符位置
        int end = 18;// 第19个字符位置
        char buf[] = new char[end - start];
        
        s.getChars(start, end, buf, 0);
        
        System.out.println(buf);
    }
}
