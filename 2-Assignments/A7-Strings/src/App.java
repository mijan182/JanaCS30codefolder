/*Project name: Strings Basics
 * Name:Jana Marie Reyes
 * Date: 9/21/24
 * Project Description:
 * Part one:
*Your code for part one should remove the word “very ” (and following space) from message1 and print the new message.
*You must use .indexOf() to find the start position of a the part of the string you want to remove.
*You need to use .length() to find the end point of the string you want to remove.
*You can then use .substring() to create a new string removing the word.
*Part two:
*Your code for part two should replace lol in the message with laugh out loud and print the new message. You WILL NOT just change message 2 and replace lol with laugh out loud.
 */

public class App {
    public static void main(String[] args) throws Exception {
        String m1 = "I am very happy!";
        String t1 = "very ";
        int start = m1.indexOf("very ");
        int end = start + t1.length();
        String nm1 = m1.substring(0,start) + m1.substring(end);
        System.out.println(nm1);

        String m2 = "That was great - lol.";
        String t2 = "lol";
        String replace = "laugh out loud";

        int start2 = m2.indexOf("lol");
        int end2 = start2 + t2.length();
        String nm2 = m2.substring(0,start2) + replace + m2.substring(end2);
        System.out.println(nm2);
        
    }
}
