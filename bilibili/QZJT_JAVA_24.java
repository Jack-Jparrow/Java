/**
 * ����ĸ��ƺͷ�ת
 */
// import java.util.Arrays;

// public class QZJT_JAVA_24 {

//     private static int i;

//     public static void main(String[] args) {
//         int[] arr = new int[] { 2, -9, 0, 5, 7, 9 };
//         int[] copy = new int[arr.length];
//         int[] temp = new int[arr.length];
//         int k = 0;// temp��Ԫ���±�

//         // ����
//         for (int i = 0; i < arr.length; i++) {
//             copy = Arrays.copyOf(arr, arr.length);
//             Arrays.asList(copy, arr);
//             // System.out.println(copy[i]);
//         }
//         System.out.println(Arrays.toString(copy));

//         // ��ת
//         for (int i = arr.length - 1; i >= 0; i--) {
//             temp[k] = arr[i];
//             k++;
//         }

//         arr = temp;

//         System.out.println(Arrays.toString(arr));
//     }
// }