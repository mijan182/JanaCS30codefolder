import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);

        int choice = 0;

        System.out.println("Please select a number: ");
        choice = inp.nextInt();

        // if (choice == 7){
        //     System.out.println("You selected 7,amazing!");
        // }else if (choice == 6){
        //     System.out.println("You selected 6,amazing!");
        // }else if (choice == 5){
        //     System.out.println("You selected 5,amazing!");
        // }else {
        //     System.out.println("You picked a weird number.");
        // }
        
        switch (choice){
            case 7:
                System.out.println("You selected 7");
                break;
            case 6:
                System.out.println("You selected 6");
                break;
            case 5:
                System.out.println("You selected 5");
                break;

            default:
            System.out.println("You picked a weird number");
            break;
        }




    }
}
