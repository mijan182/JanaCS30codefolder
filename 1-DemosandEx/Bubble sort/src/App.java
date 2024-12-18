public class App {
    public static void main(String[] args) throws Exception {
        int[] numsList = {5,15,3,8,9,1,20,7};

        //Printing the original list
        for (int i = 0; i < numsList.length; i++) {
            System.out.print(numsList[i] + ", ");
        }
        System.out.println("");

        //overwriting with the sorted list
        numsList = selsort(numsList);
        
        //Printing the sorted data
        System.out.println("\nThe sorted version is: ");
        for (int i = 0; i < numsList.length; i++) {
            System.out.print(numsList[i] + ", ");
        }

    }

    public static int[] selsort(int[] nums) {
        int n = nums.length;

        //One by one every element of the array
        for (int i = 0; i < n; i++) {

            //Find the minimum element in the array
            //Assume i is min to start
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                System.out.println("J is " + nums[j] + "; min is " + nums[minIdx]);

                if (nums[j] < nums[minIdx]) {
                    //overrite min if j is smaller than current
                    minIdx = j;
                    System.out.println("New Min"); 
                }
            }

            //Swap the found minimum element with first element
            int temp = nums[minIdx];
            nums[minIdx] = nums[i];
            nums[i] = temp;
            System.out.println("SWAP, end of cycle " + i);

        }

        return nums;
    }

    public static int[] bsort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < (n-i) - 1; j++){
                System.out.println("J = " + nums[j] + "; J+1= " + nums[j+1]);
                if (nums[j] > nums[j+1]) {
                    System.out.println("SWAP");
                    //swap the elements
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }
        }
        
        return nums;
    }

}