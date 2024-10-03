// Program name: Big or Small

// Student name: Jana Marie Reyes

// Date: 10/./24

// Program Description: Write a program to check 2 parameters.  If a is > b, output "yes".  If b is >
//a, output "no".  If a is equal to b, return "equals".

import java.util.Scanner;

public class BigOrSmallRunner {
    public static void main(String[] args) throws Exception {
        
        BigorSmall compare = new BigorSmall();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("\"Yes\" if a > b, \"No\" if a < b, and \"Equal\" if a = b");
        System.out.print("First number: ");
        int a = scanner.nextInt();
        System.out.print("Second number: ");
        int b = scanner.nextInt();

        String result = compare.check(a,b);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
