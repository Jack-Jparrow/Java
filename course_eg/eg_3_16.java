/**
 * Array类对数组排序
 */
import java.util.Arrays;

class eg_3_16 {
    public static void main(String[] args) {
        int[] num = new int[10];
        
        for (int i = 0; i < 10; i++)// 排序前：
        {
            num[i] = (int) (Math.random() * 10) + 1; // 产生1~10随机数
            
            System.out.print(num[i] + "  ");// 打印产生的随机数
        }
        
        System.out.println("\n排序后");
        
        Arrays.sort(num);// 排序
        
        for (int i = 0; i < 10; i++){// 排序后：
            System.out.print(num[i] + "  ");// 打印排序后的数
        }

        System.out.println();
        System.out.println("6的位置是：" + Arrays.binarySearch(num, 6));// 搜索6的位置
    }
}
