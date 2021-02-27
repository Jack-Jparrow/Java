/**
 * 找出如下数组中最大的元素和最小的元素：
 * a[][]={{3, 2, 6}, {6, 8, 2, 10｝，｛5｝，｛12，3，23｝｝。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-13 15:27:11 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-13 16:59:58
 */

public class qm9 {

    public static void main(String[] args) {
        int[][] a = {{3, 2, 6},
            {6, 8, 2, 10},
            {5},
            {12, 3, 23}
        };
        int max = a[0][0];
        int min = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] >= max) {
                    max = a[i][j];
                }
                if (a[i][j] <= min) {
                    min = a[i][j];
                }
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}