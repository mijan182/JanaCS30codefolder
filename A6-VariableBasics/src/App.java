//Program name: Variable Basics
//Name: Jana Marie Reyes
//Date: 9/19/24
//Program Description: Write a code to print the number of chicken 
//wings if you have $4.75 and they cost $0.75 each. 
//Remember that you can’t buy part of a wing.
 
public class App {
    public static void main(String[] args) throws Exception {
        double Money = 4.75;
        double Cost = 0.75;
        int numofchickenwings = (int)(Money / Cost);
        System.out.println("The total amount of chicken wings you can purchase is " + numofchickenwings + " wings.");
    }
}