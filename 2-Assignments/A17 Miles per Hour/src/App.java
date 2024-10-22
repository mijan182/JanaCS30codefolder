// Program name: A17 Miles per Hour
// Student name: Jana Marie Reyes
// Date: 10/11/24
// Program Description: Given a distance traveled (miles) and elapsed time (hours and minutes), calculate the speed in miles per hour.  

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        MPHCalc test = new MPHCalc();


        System.out.print("Enter the distance: ");
        int distance = input.nextInt();
        System.out.print("Enter the hours: ");
        int hours = input.nextInt();
        System.out.print("Enter the minutes: ");
        int minutes = input.nextInt();

        test.numbers(distance, hours, minutes);
        test.MPHcalculate(distance, hours, minutes);
        input.close();
    }
}
