//Program name: A31 array fun house
//Name:Jana Marie Reyes
//Date finished:11/22/24
//description; Write several array manipulation methods. 
// One method will sum up a section of a provided array,
// another method will count up how many of a certain number 
// occur in the array, and the last method will remove all of 
// a certain value from the array.

 import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array1 = {4,7,10,0,1,7,6,5,3,2,9,7};
        int[] array2 = {7,4,2,7,3,4,6,8,9,7,0,10,0,1,7,6,5,7,3,2,7,9,9,8,7};

        System.out.println("First array results: ");
        printArrayResult1(array1);

        System.out.println("Second array results: ");
        printArrayResult2(array2);
        
                
            
                }
        
            private static void printArrayResult1(int[] array1) {
                System.out.println(Arrays.toString(array1));
                System.out.println("Sum of spots 3-6: "+ arraysutil.sumSec(array1,3,6));
                System.out.println("Sum of spots 2-9: "+ arraysutil.sumSec(array1,2,9));
                System.out.println("Number of 4s: "+arraysutil.countOccur(array1,4));
                System.out.println("Number of 9s: "+arraysutil.countOccur(array1,9));
                System.out.println("Number of 7s: "+arraysutil.countOccur(array1,7));


                int[] result = arraysutil.removeOccur(array1, 7);
                System.out.println("Array with all 7s removed: " + Arrays.toString(result)); 





            }  

            private static void printArrayResult2(int[] array2){
                System.out.println("\n"+Arrays.toString(array2));
                System.out.println("Sum of spots 3-6: "+ arraysutil.sumSec(array2,3,6));
                System.out.println("Sum of spots 2-9: "+ arraysutil.sumSec(array2,2,9));
                System.out.println("Number of 4s: "+arraysutil.countOccur(array2,4));
                System.out.println("Number of 9s: "+arraysutil.countOccur(array2,9));
                System.out.println("Number of 7s: "+arraysutil.countOccur(array2,7));

                int[] result = arraysutil.removeOccur(array2, 7);
                System.out.println("Array with all 7s removed: " + Arrays.toString(result)); 
            }


        

    }

