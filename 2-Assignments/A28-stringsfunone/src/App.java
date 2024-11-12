// Program name: A28-stringsfunone
// Student name: Jana Marie Reyes
// Date: 11/12/24
// Program Description: Given a two word String, print the original string on the screen.  Next, uppercase the original string and print the new string on the screen.  Finally, add a – hyphen between the two words that make up the current string and print the new string on the screen.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
                boolean flag = true;
        Scanner input = new Scanner(System.in);

        while(flag){        
        System.out.print("Please input a two worded string:");
        String twowords = input.nextLine();

        sentencestring.stringy(twowords);

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
