package interviewquestions.Java_Collections.ArrayClass;

import java.util.Arrays;

public class Arraysclassbasics {
    
    // Used for manupilating arrays

    public static void main(String[] args){

        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        int index = Arrays.binarySearch(nums, 5);

        // Important Implementations
        System.out.println(index);

        
    }
}
