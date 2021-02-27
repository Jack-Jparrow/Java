/**
 * 获取计算机系统的相关信息
 */
class eg_3_20 {
    public static void main(String[] args) { // 以下是调用上面的方法getProperty()，获取相关的属性
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("java.vm.version"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("java.vendor"));
    }
}
