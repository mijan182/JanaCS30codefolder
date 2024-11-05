/*Program name: A25-Random Numbers Task
 * Name: Jana Marie Reyes
 * Date: 11/4/24
 * Description: Design a program that generates two random integers, stores them into temporary variables, and then compared the two to find the largest and the smallest.
 */

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        for(int i=0;i<10;i++){//created loop
          Random r = new Random();//named random with new name(like a scanner)
        int first = r.nextInt();//made the first two variables
        int second = r.nextInt();

        RNT.randomsthings(first, second);//placed variables into method
   
        }
       
    }
}
