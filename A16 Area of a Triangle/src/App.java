
// Program name: A16 Area of a Triangle
// Student name: Jana Marie Reyes
// Date: 10/10/24
// Program Description: Calculate the area of a triangle given the values for all three sides.


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        calculator test = new calculator();

        System.out.println("Enter side A: ");
        Double sideA = input.nextDouble();
        System.out.println("Enter side B: ");
        Double sideB = input.nextDouble();
        System.out.println("Enter side C: ");
        Double sideC = input.nextDouble();
        input.nextLine();

        test.sides(sideA, sideB, sideC);
        test.Calculator(sideA, sideB, sideC);

        input.close();
    }
}
