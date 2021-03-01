/**
 * 全排列模板
 *
 * @Author: Jack Jparrow
 * @Date: 2021-03-01 19:12:27
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-03-01 19:18:51
 */

public class 全排列 {

    static int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };// 要排列的数（放进数组）
    static int num = 0;

    public static void main(String[] args) {
        allSort(a, 0, a.length - 1);
        System.out.println(num);// 根据条件对num适当运算（+-*/之类）
    }

    static void judge() {
        int x = a[0] + a[1] + a[2] + a[3];
        int y = a[3] + a[4] + a[5] + a[6];
        int z = a[6] + a[7] + a[8] + a[0];
        // 各种判断条件辅助num++来计数↑

        if (x == y && y == z) {
            num++;
        }
    }

    /**
     * 交换第i个元素到最开始
     * 
     * @param a
     * @param i
     * @param j
     */
    static void exchange(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 开始全排列
     * 
     * @param a
     * @param begin
     * @param end
     */
    static void allSort(int[] a, int begin, int end) {
        if (begin == end) {
            judge();
            return;
        }

        for (int i = begin; i <= end; i++) {
            exchange(a, begin, i);
            allSort(a, begin + 1, end);// 把后面的元素递归全排列
            exchange(a, begin, i);// 交换回来
        }
    }
}