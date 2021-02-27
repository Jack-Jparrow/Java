/**
 * 创建字符串对象，显示该对象中的字符串
 */
class eg_3_10 {

    public static void main(String[] args) {
        // 声明定义初始化数组
        char c[] = { 'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'o', 'o', 'p' };
        String s1 = new String(c);// 创建字符串对象
        String s2 = new String(s1);

        System.out.println(s1);// 打印
        System.out.println(s2);
    }
}
