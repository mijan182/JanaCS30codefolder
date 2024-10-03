// Program name: Big or Small

// Student name: Jana Marie Reyes

// Date: 10/./24

// Program Description: Write a program to check 2 parameters.  If a is > b, output "yes".  If b is >
//a, output "no".  If a is equal to b, return "equals".


public class BigOrSmallRunner {
    public static void main(String[] args) throws Exception {
        

        BigorSmall.check(10,20);
        BigorSmall.check(20, 10);
        BigorSmall.check(20, 20);
        BigorSmall.check(10, 10);
        BigorSmall.check(0, 1);
        BigorSmall.check(1, 0);
        BigorSmall.check(3,5);
        BigorSmall.check( 5, 3 );	
		BigorSmall.check( 5342, 323 );	
    
    }
}
