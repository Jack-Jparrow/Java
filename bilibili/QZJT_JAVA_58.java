/**
 * 包装类
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-05 10:13:27
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-05 14:56:39
 */
public class QZJT_JAVA_58 {

    public static void main(String[] args) {
        Integer i = Integer.valueOf(1);// 装箱
        Integer i2 = 112;// 自动装箱
        int i3 = i;// 自动拆箱
        
        System.out.println("i2 " + i2);
        System.out.println("i3 " + i3);
        System.out.println(i);

        Integer j = Integer.valueOf("1");
        System.out.println(j);

        boolean l = Boolean.parseBoolean("false");
        System.out.println("l" + l);

        float m = Float.parseFloat("0.24");
        System.out.println("m " + m);

        // Integer k = Integer.valueOf("abc");
        // System.out.println(k);

        int i0 = i.intValue();
        System.out.println(i0);// 拆箱
    }
}