public class App {
    public static void main(String[] args) throws Exception {
        //int[] scores = null;
        //String [] names = null;

        //create or initialize array
        //scores = new int[10];
        //names = new String[10];

        // Assign values of array
        //list of data (solution set)
        String[] names = {"sutter", "golden","cook","fox","wolf"};
        int[] scores = {9000, 2342, 92384, 2048,2096};

        //individual positions
        // names[0] = "Wolf";
        // scores[0] = 9000;

        //array length property
        System.out.println("Scores length is: "+ names.length);

        //outputting or accessing arrays

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]+": "+scores[i]);
        }
        
        //output in reverse
        for(int i = names.length-1; i>=0;i--){
            System.out.println(i + ")"+names[i]+": "+scores[i]);}

            //find sum of the array
            int sum =0;//use 1 for multiplication or division
            for(int i = 0; i< scores.length; i++){
                sum = sum + scores[i];

            }
            System.out.println("The sum is " + sum);
                int count = 0;
            //count elements of an array(eg. even numbers)
            for(int i=0; i<scores.length; i++){
                if(scores[i]%2 == 0){
                    count ++;
                }

            }
            System.out.println("There are "+count+" even numbers");
    }
}
