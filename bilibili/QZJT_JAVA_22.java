/**
 * 二维数组
 */
// public class QZJT_JAVA_22 {

//     public static void main(String[] args) {
//         int[][] a = new int [][]{
//             {1, 2},
//             {4, 2},
//         };
//         int [][] b = new int [2][3];//第一维部分的长度是2；第二维也就是第一维的每个元素的长度是3
//         int [][] c = new int [2][];

//         System.out.println(a[1][0]);

//         //多维数组所有元素和
//         int [][] arr = new int[][]{
//             {3, 8, 2},
//             {2, 7},
//             {9, 0, 1, 6}
//         };
//         int res = 0;
//         /*或者这么写↓
//         int len = arr.length;//整个大数组的长度

//         for (int i = 0; i < len; i++) {
//             int[] arr0 = arr[i];
//             int len2 = arr0.length;//每一个小数组的长度

//             for (int j = 0; j < len2; j++) {
//                 res += arr0[j];
//             }
//         }*/
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 res += arr[i][j];
//             }
//         }

//         System.out.println(res);
//     }
// }