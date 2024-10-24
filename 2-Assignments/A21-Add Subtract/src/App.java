// Program name: 21 add subtract
// Student name: Jana Marie Reyes
// Date: 10/24/24
// Program Description: Write a program to check 2 parameters.  If a is > b, return a - b.  If b is > a, return b - a.  If a is equal to b, return a + b.

public class App {
    public static void main(String[] args) throws Exception {

        //test cases
        addsub test = new addsub();
        test.addsubs(10,20);
        test.addsubs(20,10);
        test.addsubs(20,20);
        test.addsubs(10,10);
        test.addsubs(0,1);
        test.addsubs(1,0);
        test.addsubs(3,5);
        test.addsubs(5,3);
        test.addsubs(55342,323);
    }
}
