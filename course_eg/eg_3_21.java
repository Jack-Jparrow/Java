/**
 * 设置系统的相关属性
 */
public class eg_3_21 {
    public static void main(String args[]) {

        String strProperty = System.getProperty("java.io.tmpdir");
        System.out.println("原来的临时文件存储目录名称：" + strProperty);
        System.out.println("将临时文件目录设置为C:/Tmp");
        String oldProperty = System.setProperty("java.io.tmpdir", "C:/Tmp");
        
        strProperty = System.getProperty("java.io.tmpdir");
        
        System.out.println("设置后的临时文件存储目录名称：" + strProperty);
    }
}
