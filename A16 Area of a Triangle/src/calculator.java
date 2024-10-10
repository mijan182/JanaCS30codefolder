public class calculator {

        public void sides(double sideA, double sideB, double sideC){
            System.out.print(sideA + " " + sideB + " " + sideC + " ");
        }

        public void calculator(double sideA, double sideB, double sideC){
            double perimeter = sideA + sideB + sideC;
            double s = perimeter / 2;
            double area = Math.sqrt(s*(s - sideA)*(s - sideB)*(s - sideC));
            System.out.printf("Area = %.2f", area);
        }

}
