/**
 * 编写程序输出以下结果
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-13 18:49:19 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-13 19:05:19
 */

public class qm14 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}