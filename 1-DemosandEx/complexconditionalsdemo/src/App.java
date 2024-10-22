public class App {
    public static void main(String[] args) throws Exception {
        int x = 2;
        int y = 5;

        if(x<0){
            System.out.println("x is negative");

        }else if (x==0){
            System.out.println("x is zero");
        }else {
            System.out.println("x is positive");


            //nested
            if (x>0){
                if (x>y){
                    System.out.println("x is positive and greater than " + y);
                }
            }
        }
        // equivalent
        if (x> 0 && x > y){
            System.out.println("x is pos+ and greater than " + y);
        }

        //else if and the or statement
        if (x<0){
            System.out.println("Not a winner");

        }else if (x < 5){
            System.out.println("Not a winner");

        }else{
            System.out.println("This is a winning number.");
        }
        

        // equivalent
        if(x<0 || x>5){
            System.out.println("not a winner");
        }else{
            System.out.println("winner");
        }
    }
}
