public class coolnums {
    public static boolean iscoolnums(int num){

            return ((num%3==1)&&(num%6==1)&&(num%4==1)&&(num%5==1)); 
            //checks if the number is a cool number (remainder is 1 when divided by 3,4,5, and 6)

    }


    public static int countcoolnums(int stop){
        //counts the number of "cool numbers"
        int count = 0;
        for (int x = 6; x<stop; x++){ //stop = the given number by input = marks where it stops counting
            if (iscoolnums(x)){ //adds one everytime a cool number is verified
                count ++;
            }
        }
        return count; //return statement

    }

}
