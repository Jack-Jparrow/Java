/**
 * 根据主类，完成Compare类，
 * 该类有两个boolean类型的方法，
 * 方法isSameNum用来比较两组数是否完全相同，
 * 方法isSameSum用来比较两组数的和是否相等。
 * 相同或者相等返回true，否则返回false。
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-17 18:52:19 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-17 19:08:41
 */

class Compare32_1{
    public Compare32_1(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    int x;
    int y;
    int z;

    int sum = x + y + z;

    public boolean isSameNum(Compare32_1 a){
        if (a.x == x && a.y == y && a.z == z) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isSameSum(Compare32_1 b){
        if (b.sum == sum) {
            return true;
        } else {
            return false;
        }
    }
}

public class qm32_1 {

    public static void main(String args []) {

        Compare32_1 a = new Compare32_1(3,6,9);

        Compare32_1 b = new Compare32_1(3,6,9);

        Compare32_1 c = new Compare32_1(6,9,3);

        System.out.println(a.isSameNum(b));

        System.out.println(b.isSameNum(c));

        System.out.println(a.isSameSum(b));

        System.out.println(b.isSameSum(c));    
    }

}