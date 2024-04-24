package interviewquestions.BabbarSheetProblems.Arrays;

import java.util.Arrays;

// Find the maximun and minimum element of array
// TIME COMPLEXITY - O(n)
public class Array_2 {

    public static void array2fnc1(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length; i++){

            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
    }

    public static void array2fnc2(int[] arr){
        Arrays.sort(arr);
        System.out.println("Maximum element: " + arr[0]);
        System.out.println("Minimum element: " + arr[arr.length-1]);
    }

    public static void main(String[] args){

        int[] arr1 = {12,2,32,4,67};
        array2fnc1(arr1);
        array2fnc2(arr1);
        
    }
    
}
