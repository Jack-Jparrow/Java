public class eg_4_4 {
    private int x = 1;
    private int y = 1;
    private int z = 1;

    void changeVar(int a, int b, int c){
        x = a;
        int y = b;
        int z = 9;
        System.out.println("In changeVar: " + "x =  " + x + " y = " + y + " z =  " + z);
        this.z = c;
    }

    String getXYZ(){
        return "x = " + x + " y =  " + y + " z =  " + z;
    }

    public static void main(String args[]) {
        eg_4_4 v = new eg_4_4();
        System.out.println("Before changeVar:  " + v.getXYZ());
        v.changeVar(10, 10, 10);
        System.out.println("After changeVar:  " + v.getXYZ());
    }
}
