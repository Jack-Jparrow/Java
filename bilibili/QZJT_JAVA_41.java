/**
 * 三维空间中的点，生成特定坐标的点对象。提供可以设置三个坐标的方法
 * 
 * @Author: Jack Jparrow
 * @Date: 2020-11-25 19:50:50
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-11-25 20:07:57
 */
public class QZJT_JAVA_41 {
    int x = 0;
    int y = 0;
    int z = 0;

    public QZJT_JAVA_41(int aX, int bY, int cZ) {
        x = aX;
        y = bY;
        z = cZ;
    }

    public void showPoint() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    public void setPoint(int aX, int bY, int cZ) {
        x = aX;
        y = bY;
        z = cZ;
    }

    public static void main(String[] args) {
        QZJT_JAVA_41 point = new QZJT_JAVA_41(5, 6, 5);
        point.setPoint(6, 7, 8);
        point.showPoint();
    }
}