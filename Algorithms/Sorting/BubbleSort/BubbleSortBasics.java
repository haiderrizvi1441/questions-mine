package interviewquestions.Algorithms.Sorting.BubbleSort;

import java.util.Arrays;

// Pushing the heaviest element at the last
// Bubble Sort gives an ascending order array 
// Comparison is done n-1 times

// Time Complexity = O(n^2O)
public class BubbleSortBasics {
    public static void main(String[] args){

        int [] intarr1 = {1,4,8,5,3,2};
        int temp, size = (intarr1.length);

        // Outer Loop runs n-1 times for , each time sorting the array once 
        for(int i=0 ; i<(size-1); i++){
            // inner loop runs n-1-i , each time last element which be sorted so no need to iterate over whole loop
            for(int j=0 ; j<(size-1-i) ; j++){
                // swap if left element is biggest than right
                if(intarr1[j] > intarr1[j+1]){

                    //swap
                    temp = intarr1[j];
                    intarr1[j] = intarr1[j+1];
                    intarr1[j+1] = temp;
                }
            }System.out.println(Arrays.toString(intarr1));
        }System.out.println("The Sorted Array : ");
        System.out.println(Arrays.toString(intarr1));
            
            

            

    }
        

}
    

