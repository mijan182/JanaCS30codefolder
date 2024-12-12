//Name: Jana Marie Reyes
//Name of program: A37 Reverse Raffle Draw
//Date: 12/11/24
//Description: Create a reverse raffle draw using an array or ArrayList with the requirements given
//use arraylist

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> nameList = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("The Reverse Raffle Draw\n");
        System.out.println("A reverse raffle is a raffle draw where the name drawn\nfrom a hat they DOES NOT win. The last name drawn is the actual winner.\n");
        System.out.println("For this, we'll have 10 names inputted into the hat,\nand for every name drawn, they get removed from the list.\nLast name standing wins!");


        //loop to get user input
        while (nameList.size() < 10) {
            System.out.print("Enter name #" + (nameList.size() + 1) + ": ");
            String names = input.nextLine();
            nameList.add(names);

            System.out.print("\nYou entered the following names: ");
        for (String name : nameList) {
            System.out.print(name + " ");

        }
        System.out.println();
    }
    }
}
