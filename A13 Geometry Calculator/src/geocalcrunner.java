// Program name: A13 Geometry Calculator
// Student name: Jana Marie Reyes
// Date: 10/9/24

import java.util.Scanner; 

//asks for user input rather than using cases 
public class geocalcrunner {
    public static void main(String[] args) throws Exception {
        //initializes new terms (if thats how you phrase it)
        Scanner input = new Scanner(System.in);
        geocalc compute = new geocalc();

            System.out.println("What do you wish to calculate? \n A. Perimeter of a rectangle \n B. Surface area of a cube \n C. Area of a circle \n (please answer with the corresponding Capital letter.) \n");
            String choice = input.next();
            
            //using if else statements to respond to text response of user
            if (choice.equals("A")){
                System.out.println("Input the width: ");
                double width = input.nextDouble();
                System.out.println("Input your length: ");
                double length = input.nextDouble();
                input.nextLine();
                
                compute.rectangle(length, width);

            } else if (choice.equals("B")){
                System.out.println("Input the side measurement: ");
                double side = input.nextDouble();
                input.nextLine();
                
                compute.cube(side);
            } else if (choice.equals("C")){
                System.out.println("Input the side measurement: ");
                double radius = input.nextDouble();
                input.nextLine();
                
                compute.circle(radius);
            }
            //closes scanner
            input.close();
    }
}
