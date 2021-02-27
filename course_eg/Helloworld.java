public class Helloworld {
    public static void main(String args[]) {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.exit(0);
        }
        System.out.println("this is my first java helloworld!");
    }
}