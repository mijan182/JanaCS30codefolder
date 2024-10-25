/*Program name: A22-Leap Year
 * Name: Jana Marie Reyes
 * Date: 10/25/24
 * Program description: Write a program to determine if a year is a leap year.  A leap year is any year evenly divisible by 4 or 400.  You will need to use mod %.
 */

 //this is the runner!!!

 import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //scanner for input
        Scanner input = new Scanner(System.in);


        //prints the question and asks for input
        //then scans the input
        System.out.println("Enter a year: ");
        int year = input.nextInt();


        //calls method from other class
        leapyear.entLeapYear(year);
        

        //closes scanner
        input.close();
    }
}
