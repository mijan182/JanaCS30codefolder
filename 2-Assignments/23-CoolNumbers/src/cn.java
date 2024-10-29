import java.util.Scanner;

public class cn {
    public static void replayNinput(){
        boolean flag = true;
        while (flag){
            Scanner input = new Scanner(System.in);
            System.out.print("Please input a number: ");
            int num = input.nextInt();

            System.out.println( coolnums.countcoolnums(num) + " cool numbers between 6 - " + num);
            
            System.out.print("Go again?\n> ");
            String userinput = input.nextLine();

            if (userinput.equals("no")){
                flag = false;

            input.close();
            }
        }

    }
}
