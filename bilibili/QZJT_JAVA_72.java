/**
 * 内部类
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-08 08:32:53
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-08 09:06:53
 */
class Test72 {
    int i;
    protected int z;
    private int k;

    class A {
        int i;

        public void setTest72Fileds() {
            Test72.this.i = 1;
            Test72.this.z = 2;
            Test72.this.k = 3;
        }

        public int set() {
            this.i = 4;

            return i;
        }

    }

    public void setInfo() {
        new A().setTest72Fileds();
    }

    public void showInfo() {
        System.out.println(this.i);
        System.out.println(this.k);
        System.out.println(this.z);
        System.out.println(new A().set());
    }
}

public class QZJT_JAVA_72 {

    public static void main(String[] args) {
        Test72 t = new Test72();

        t.setInfo();
        t.showInfo();
    }
}