// Program name: A18 Quadratic Equation
//Student name: Jana Marie Reyes
// Date: 10/17/24
// Program Description: Given the values of a quadratic equation, calculate the two possible answers.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        calculator test = new calculator();


        //scanner used to ask for input
        System.out.print("Enter variable A: ");
        Double varA = input.nextDouble();
        System.out.print("Enter variable B: ");
        Double varB = input.nextDouble();
        System.out.print("Enter variable C: ");
        Double varC = input.nextDouble();
        input.nextLine();


        //calls methods to print out the output
        test.variables(varA, varB, varC);
        test.calc(varA, varB, varC);

        //closes scanner
        input.close();
    }
}
