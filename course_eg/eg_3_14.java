/**
 * 字符串翻转
 */
class Reverse {
    public static void main(String args[]) {
        StringBuffer s = new StringBuffer("123456789");
        
        System.out.println(s);
        
        s.reverse();// 调用方法，生成逆序即翻转字符串
        
        System.out.println(s);
    }
}
