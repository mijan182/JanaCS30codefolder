// Program name: A8 Input Basics
// Student name: Jana Marie Reyes
// Date: 9/24/24
// Program Description:Define, input, and print some variables and their values.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // User enters for input
        Scanner keys = new Scanner(System.in);

        System.out.println("Enter your first integer: ");
        int intOne = keys.nextInt();
        keys.nextLine();
        System.out.println("Enter your second interger: ");
        int intTwo = keys.nextInt();
        keys.nextLine();

     
        System.out.println("Enter your first decimal number: ");
        double duoOne = keys.nextDouble();
        keys.nextLine();
        System.out.println("Enter your second decimal number: ");
        double duoTwo = keys.nextDouble();
        keys.nextLine();


        // Output is printed (im going insane??)

        System.out.println("\n\nYour numbers are...\n");

        System.out.println("integer one: " + intOne);
        System.out.println("integer one: " + intTwo);
        System.out.println("double one: " + duoOne);
        System.out.println("double two: " + duoTwo);

        System.out.println("\nWhen added...\n");
        int newnumOne = intOne + intTwo;
        double newnumTwo = duoOne + duoTwo;
        System.out.println( intOne + " + "+ intTwo + " = " + newnumOne);
        System.out.println( duoOne + " + "+ duoTwo + " = " + newnumTwo + "\n");





    }
}
