// Program name: SumUpStuff
// Student name: Jana Marie Reyes
// Date: 10/7/24
// Program Description:  Given two numbers, calculate the sum and print the sum.

public class SumUpStuff {
    public static void main(String[] args) throws Exception {
        Sum test = new Sum();				
		test.setNums(2,6);
		test.sum( );
		test.print();

        //second test case
        test.setNums(10,2);
		test.sum( );
		test.print();

        //third test case
        test.setNums(120,4568);
		test.sum( );
		test.print();

        //fourth test case
        test.setNums(345.354,0.1238);
		test.sum( );
		test.print();
    }
}
