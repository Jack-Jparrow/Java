/**
 * 分支结构if...else
 */
public class QZJT_JAVA_12 {

    public static void main(String[] args) {
        int i = 1;

        if (i != 1) {
            System.out.println(1);
        }
        
        //判断奇偶性
        if (i % 2 == 0) {
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
        
        //判断数字是几，输出星期几
        if (i == 1) {
            System.out.println("星期一");
        }else if (i == 2) {
            System.out.println("星期二");
        }else if (i == 3) {
            System.out.println("星期三");
        }else if (i == 4) {
            System.out.println("星期四");
        }else if (i == 5) {
            System.out.println("星期五");
        }else if (i == 6) {
            System.out.println("星期六");
        }else if (i == 7) {
            System.out.println("星期日");
        }else{
            System.out.println("不知道");
        }

    }
}