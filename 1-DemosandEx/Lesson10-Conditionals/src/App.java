public class App {
    public static void main(String[] args) throws Exception {
        int x = 2;
        int y = 3;

        //NOT (A & B) short circut law
        //(!(x > 0 && y < 2))
        if (!(x > 0) || !(y < 2)) {
            System.out.println("Wear a coat");
            System.out.println("Wear gloves");

        }
        System.out.println("Bye");
    }
}
