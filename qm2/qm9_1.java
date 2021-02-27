/**
 * 找出如下数组中最大的元素和最小的元素：
 * a[][]={{3, 2, 6}, {6, 8, 2, 10}，{5}，{12，3，23}}。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 17:58:09 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-20 19:50:50
 */

public class qm9_1 {

    public static void main(String[] args) {
        int[][] a = {{3, 2, 6}, 
                {6, 8, 2, 10}, 
                {5},
                {12, 3, 23}
            };

        int min = a[0][0];
        int max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max <= a[i][j]) {
                    max = a[i][j];
                }
                if (min >= a[i][j]) {
                    min = a[i][j];
                }
            }
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}