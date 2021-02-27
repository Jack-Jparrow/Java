/**
 * “Java”替换成“This is Turbo C”
 */
class Replace {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Java programming!");
        sb.replace(0, 4, "This is Turbo C");// 第一个字符位置为0
        System.out.println("After replace: " + sb.toString());
        // 也可使用下面的方法
        // sb=sb.replace(0, 4, "This is Turbo C");
        // System.out.println("After replace: " + sb);
    }
}
