/**
 * 分支结构switch
 */
public class QZJT_JAVA_13 {

    public static void main(String[] args) {
        //判断数字是几，输出星期几
        int i = 2;
        String str = "Summer";

        switch (i) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            
            default:
                break;
        }

        switch (str) {
            case "Spring":
                System.out.println("春天");
                break;
            case "Summer":
                System.out.println("夏天");
                break;
            case "Autumn":
                System.out.println("秋天");
                break;
            case "Winter":
                System.out.println("冬天");
                break;
        
            default:
                break;
        }

        //小写a, b, c, d, e转换为大写A, B, C, D, E
        char c = 'a';
        // char c = 'b';
        // char c = 'c';
        // char c = 'd';
        // char c = 'e';

        switch (c) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
        
            default:
                break;
        }
    }
}