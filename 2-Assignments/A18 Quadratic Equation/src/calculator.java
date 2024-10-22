

public class calculator {
    //variables() prints out the variables
    public void variables(double varA, double varB, double varC){
        System.out.println("\nvalue A: " + varA + "\nvalue B: "+varB+"\nValue C: "+ varC);
    }


    //the calculator | calculates using if else statements
    public void calc(double varA, double varB, double varC){
        
        //simplifying variables
        double a = varA;
        double b = varB;
        double c = varC;

        //calculating discriminant
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0){ //calculates it normally
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);


            //prints out answer
            System.out.printf("\nroot one: %.2f\n root two: %2.f", root1, root2);

            //
        }else if (discriminant == 0){//if its 0, then first and second root equals
            double root1 = -b/(2*a);

            //prints out ans
            System.out.printf("\nroot one = root two = %.2f", root1);
        }else{
            //discriminant cannot be negative, so we resort to imaginary #s and reals
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);

            //prints out ans
            System.out.printf("\nroot1 = %.2f+%.2fi", real, imaginary);
            System.out.printf("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }

}
