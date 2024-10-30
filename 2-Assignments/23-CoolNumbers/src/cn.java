import java.util.Scanner;

public class cn {
    public static void replayNinput(){
        boolean flag = true; //trigger; keeps track if user wishes to replay the code
        Scanner input = new Scanner(System.in); //scanner used to scan user input
        while (flag){ //used to create the entire loop
           
            System.out.print("Please input a number: "); 
            int num = input.nextInt();
            input.nextLine(); //input of a number 

            System.out.println( coolnums.countcoolnums(num) + " cool numbers between 6 - " + num); //the answer or output
            
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
        input.close();//closes input

    }
}
