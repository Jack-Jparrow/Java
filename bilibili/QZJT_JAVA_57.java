/**
 * ==和equals
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-05 09:08:39
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-05 15:05:20
 */
class Mydate {
    public Mydate(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    int y;
    int m;
    int d;

    @Override
    public boolean equals(Object obj) {
        /*
         * boolean flag = false;
         * 
         * if (obj instanceof Mydate) { Mydate o = (Mydate) obj; if (this.y == o.y &&
         * this.m == o.m && this.d == o.d) { flag = true; } }
         * 
         * return flag;
         */
        // 或者
        int flag = 1;

        if (obj instanceof Mydate) {
            Mydate o = (Mydate) obj;
            flag = 0;

            if (this.y != o.y) {
                flag += 1;
            }
            if (this.m != o.m) {
                flag += 1;
            }
            if (this.d != o.d) {
                flag += 1;
            }
        }

        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override//给QZJT_JAVA_59.java用
    public String toString() {
        String str = this.y + "-" + this.m + "-" + this.d;
        return str;
    }
}

public class QZJT_JAVA_57 {

    public static void main(String[] args) {
        Mydate o1 = new Mydate(2020, 11, 2);
        Mydate o2 = new Mydate(2020, 11, 2);

        System.out.println(o1.equals(o2));
    }
}