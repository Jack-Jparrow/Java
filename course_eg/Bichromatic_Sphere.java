//Bichromatic_Sphere双色球
public class Bichromatic_Sphere{
    int num1;
    int num2;
    //输出开奖提示
    class tip{
        public void ti(){
            System.out.printf("本期的双色球中奖号码是:");
        }
    }
    tip n = new tip();
    public void csl0(){
        n.ti();
    }

    //前五个数
    class inner1{
        public void s(){
            java.util.Random random = new java.util.Random();
            int j = 0;
            for(int i = 0; i < 33; i++){
                while (j < 4) {
                    num1 = random.nextInt(34);
                    j++;
                    if (num1 == 0) {
                        break;
                    }
                    else{
                        System.out.print(num1+"  ");
                    }
                }
            }
        }
    }
    inner1 x = new inner1();
    public void csl(){
        x.s();
    }

    //后两个数
    class inner2{
        public void s2(){
            java.util.Random random = new java.util.Random();
            int j = 0;
            for(int i = 0; i < 15; i++){
                while (j < 3) {
                    num2 = random.nextInt(16);
                    j++;
                    if (num2 == 0) {
                        break;
                    }
                    else{
                        System.out.print(num2+"  ");
                    }
                }
            }
        }
    }
    inner2 y = new inner2();
    public void csl2(){
        y.s2();     
    }
    public static void main(String[] args){
        Bichromatic_Sphere o = new Bichromatic_Sphere();
        o.csl0();
        o.csl();
        o.csl2();
    }
}