

//The different calculators
public class geocalc {
   //perimeter of a rectangle
     public void rectangle (double length , double width){
        double perimeter = 2*(length + width);
        System.out.printf("The perimeter of the rectangle is %.2f", perimeter);
     }
     //SA of a cube 
     public void cube (double side){
        double surfacearea = 6*(side*side);
        System.out.printf("The surface area of the cube is %.2f", surfacearea);
     }
     //perimeter of a rectangle
     public void circle (double radius){
        double pi = 3.14;
        double areacircle = pi*(radius*radius);
        System.out.printf("The surface area of the cube is %.2f", areacircle); //%.2f to output answer with 2 decimal places
     }
}
