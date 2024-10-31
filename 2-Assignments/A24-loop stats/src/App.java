/*Program name: A24-loop stats
Student name: Jana Marie Reyes
Date: 10/31/24
Program Description:Run a loop from a provided start number to a provided stop number.   Total up all numbers in the group, determine all odds in the group, and determine all evens in the group. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //test cases (works!)
        // looopstats.loop(1,5);
        // looopstats.loop(2,8);
        // looopstats.loop(5,15);

        //user input
        boolean flag = true;
        Scanner input = new Scanner(System.in);

        while(flag){        
        System.out.print("Please input a beginning number:");
        int beg = input.nextInt();
        input.nextLine();

        System.out.print("Please input an ending number:");
        int end = input.nextInt();
        input.nextLine();

        looopstats.loop(beg,end);

        System.out.print("Go again? (yes/no)\n> ");
            String userinput = input.nextLine(); //used to ask whether user wishes to replay loop

                if (userinput.equalsIgnoreCase("no")){ // if not, it triggers the game switch and kills loop
                    flag = false;
            }else if (userinput.equalsIgnoreCase("yes")){
                flag = true;
            }else{
                System.out.println("incorrect input."); //incorrect input = kills loop
                flag = false;
            }
    }
    input.close();
    }
}
