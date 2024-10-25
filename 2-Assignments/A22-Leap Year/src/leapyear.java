
public class leapyear {
   
    
    public static boolean entLeapYear(int year){

        //if the year's remainder is 0 when divided by 4 and 400 is 0, then it is a leap year
        if (year % 100 != 0 && year % 4 ==0 || year % 400 == 0){
            System.out.println(year + " is a leap year."); //ans
        }else{
            System.out.println(year + " is NOT a leap year.");//ans
        }
        return false;//returns
    }
}
