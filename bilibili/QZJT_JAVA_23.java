/**
 * 求数组元素最大值、最小值、平均值
 */
public class QZJT_JAVA_23 {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, -9, 0, 5, 7, 9 };
        int max = arr[0];
        int min = arr[0];
        float sum = 0.0f;
        float average = 0.0f;

        // 最大值
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            } else {
                break;
            }
        }

        System.out.println(max);

        // 最小值
        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            } else {
                break;
            }
        }

        System.out.println(min);

        // 总和、平均值
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            average = (sum / arr.length);
        }

        System.out.println(sum);
        System.out.println(average);
    }
}