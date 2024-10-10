
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
        String sideA = input.next();
        System.out.println("Enter side B: ");
        String sideB = input.next();
        System.out.println("Enter side C: ");
        String sideC = input.next();
        input.nextLine();

        test.sides(0, 0, 0);
        test.Calculator(0, 0, 0);

        input.close();
    }
}
