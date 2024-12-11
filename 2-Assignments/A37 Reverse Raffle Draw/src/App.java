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

        System.out.println("Please input your 10 chosen names!\n");

        //loop to get user input
        while (nameList.size() < 10) {
            System.out.print("Enter name #" + (nameList.size() + 1) + ": ");
            String names = input.nextLine();
            nameList.add(names);

            System.out.println("\nYou entered the following names: ");
        for (String name : nameList) {
            System.out.println(name);

        }
    }
    }
}
