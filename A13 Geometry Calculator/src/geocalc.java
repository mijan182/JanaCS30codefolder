


public class geocalc {
     public void rectangle (double length , double width){
        double perimeter = 2*(length + width);
        System.out.printf("The perimeter of the rectangle is %.2f", perimeter);
     }
     public void cube (double side){
        double surfacearea = 6*(side*side);
        System.out.printf("The surface area of the cube is %.2f", surfacearea);
     }
     public void circle (double radius){
        double pi = 3.14;
        double areacircle = pi*(radius*radius);
        System.out.printf("The surface area of the cube is %.2f", areacircle);
     }
}
