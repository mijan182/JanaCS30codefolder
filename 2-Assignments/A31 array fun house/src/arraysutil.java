import java.util.Arrays;

public class arraysutil {


    //method for sum of sections
        public static int sumSec(int[] array, int start, int end){
            int sum = 0;
            for(int i = start; i <= end;i++){
                sum += array[i];
            }
    return sum;
}


//method for counting occurances
public static int countOccur(int[]array, int value){
    int count = 0;
    for (int num : array){
        if (num==value){
            count++;
        }
    }
    return count;
    }


    //method for removing all occurances of a specific number
public static int[] removeOccur(int[]array, int value){
    int count = 0;
    for (int num:array){
        if (num!= value){
            count++;
        }
    }
    int []result = new int[count];
    int index = 0;

    for (int num:array){
        if (num!=value){
            result[index++]=num;
        }
    }

    return result;
}
}


