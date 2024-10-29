public class App {
    public static void main(String[] args) throws Exception {

        // //counting loop
        // int num = 3;
        // while (num>0){
        //     System.out.println(num);
        //     num --; //num = num - 1;
        // }

        // //game loop/program loop
        // boolean trigger = true;//trigger variable
        // while (trigger){
        //     //program code/game code/calculation
        //     System.out.println("Hello Universe");

        //     //kill switch, play again method
        //     System.out.println("Do you want to play again?");
        //     String userinput = "no";//getting user response

        //     if (userinput.equals("no")){
        //         trigger = false;//trigger game to end
        //     }


        // }

        //standard for loop in java
            //three conditions
            //for (where we start; where we end; step size)

        for(int i = 10; i > 0; i --){
            System.out.println("The number is " + i);

        }
        //equivalent while statement
        int x = 10;
        while (x>0){
            System.out.println("The number is " + x);
            x--;
        }
    }
}
