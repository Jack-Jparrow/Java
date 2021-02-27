public class eg_4_5 {
    float ptValue;
    public void changeInt(int value) {
        value = 55;
    }

    public void changeStr(String value) {
        value = new String("different");
    }

    public void changeObjValue(eg_4_5 ref) {
        ref.ptValue = 99.0f;
    }

    public static void main(String args[]) {
        String str;
        int val;

        eg_4_5 pt = new eg_4_5();

        val = 11;
        pt.changeInt(val);
        System.out.println("The value is: " + val);

        str = new String("Hello");
        pt.changeStr(str);
        System.out.println("Str value is: " + str);

        pt.ptValue  =101.0f;
        pt.changeObjValue(pt);
        System.out.println("Pt value is: " + pt.ptValue);
    }
}
