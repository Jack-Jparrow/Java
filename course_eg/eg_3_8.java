/**
 * foreach遍历数组
 */
public class eg_3_8 {

    public static void main(String[] args) {
        String[] books = {"大学计算机基础", 
                            "Java语言程序设计", 
                            "操作系统"};
        
        for (String book : books) {
            System.out.println(book);
        }
    }
}
