public class calculator {

        public void sides(double sideA, double sideB, double sideC){
            System.out.print(sideA + " " + sideB + " " + sideC + " ");
        }

        public void Calculator(double sideA, double sideB, double sideC){
            //if else statement used since there is a possiblity of not inputting a correct/valid triangle measurements
            if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)){
                double perimeter = sideA + sideB + sideC;
                double s = perimeter / 2;
                double area = Math.sqrt(s*(s - sideA)*(s - sideB)*(s - sideC));
                System.out.printf("\nArea = %.2f", area);
            }else{
                System.out.println("\nThe given sides do not form a valid triangle.");
            }

        }

}
