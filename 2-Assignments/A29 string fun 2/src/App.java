// Program name: A29 string fun 2
// Student name: Jana Marie Reyes
// Date: 11/15/24
// Program Description: Given a string and an integer value x, return a new string with the first x characters of the original string now at the end.  Make sure there are enough characters before
//attempting to move them to the end of the string.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean flag = true;
        Scanner input = new Scanner(System.in);

        while(flag){        
        System.out.print("Please input a string: ");
        String str = input.nextLine();

        System.out.print("Please input a number: ");
        int x = input.nextInt();
        input.nextLine();

        stringfun2.moveThemAll(str,x);

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
