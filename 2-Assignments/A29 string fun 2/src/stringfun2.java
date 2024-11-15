public class stringfun2 {

    public static String moveThemAll(String str, int x){
        if (str == null || str.length() <= x || x <= 0) {
            System.out.println("no can do");
            return str;
    } else{
        String firstPart = str.substring(0, x);
        String secondPart = str.substring(x);
        System.out.println();
        return secondPart + firstPart;
        
    }

    
 }
}