/**
 * 退出程序的方法
 */
public class eg_3_18 {
    public static void main(String args[]) {
        // 程序运行代码，根据代码的运行情况设置逻辑类型的状态值
        int b = 1;
        
        if (args.length > 0)
            b = Integer.parseInt(args[0]);// 命令行带一个参数
        if (b == 0) {
            System.out.println("应用程序正常结束");
            System.exit(b);
        } else {
            // 异常退出
            System.out.println("应用程序异常结束");
            System.exit(b);
        }
    }
}
