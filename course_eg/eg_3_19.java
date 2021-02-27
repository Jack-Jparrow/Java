/**
 * 数组复制
 */
class eg_3_19 { // 声明定义初始化数组
    static byte a[] = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74 };
    static byte b[] = new byte[a.length];// 声明定义数组，大小等于a的长度

    public static void main(String args[]) {
        System.out.println("a = " + new String(a));
        System.arraycopy(a, 0, b, 0, a.length);// 调用复制数组的方法
        System.out.println("b = " + new String(b));
    }
}
