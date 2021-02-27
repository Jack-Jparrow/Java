/**
 * 编写程序输出以下结果
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 19:19:10 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-16 19:23:56
 */

public class qm14_1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}