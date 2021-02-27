/**
 * 数组元素的排序（eg.冒泡排序）
 */
public class QZJT_JAVA_25 {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, -9, 0, 5, 7, 9, 56, 51, -66};
        int temp;

        // 从小到大排
        for (int i = 0; i < arr.length - 1; i++) {// 循环轮次，次数是数组长度 - 1
            for (int j = 0; j < arr.length - 1 - i; j++) {// 每一轮次数字对比排序
                if (arr[j] > arr[j + 1]) {// 此处不同
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // 从大到小排
        for (int i = 0; i < arr.length - 1; i++) {// 循环轮次，次数是数组长度 - 1
            for (int j = 0; j < arr.length - 1 - i; j++) {// 每一轮次数字对比排序
                if (arr[j] < arr[j + 1]) {// 此处不同
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}