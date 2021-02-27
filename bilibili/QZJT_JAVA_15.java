/**
 *while???¡¦
 */
public class QZJT_JAVA_15 {

    public static void main(String[] args) {
        int i = 1;

        while( i <= 100){
            System.out.println(i);
            i++;
        }

        //1-100???
        int result = 0;
        int k = 1;
        
        while (k <= 100) {
            if (k % 2 == 0) {
                
                result += k;
            }
            k++;
        }
        System.out.println(result);

        //????
        /* while (true) {
            
        } */
    }
}