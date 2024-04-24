package interviewquestions.BabbarSheetProblems.Arrays;

import java.util.Arrays;



// Reverse the array
public class Array_1 {

    // to print the array
    public static void printArray(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }





    public static void array1fnc(int[] arr, int start, int end){

        System.out.println(Arrays.toString(arr));

        int temp;

        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed Array: ");
        System.out.println(Arrays.toString(arr));

        

    }

    public static void array1fnc2(int[] arr){

        System.out.println("Array : ");
        printArray(arr);
        
        int start = 0;
        int end = arr.length -1;

        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }

        System.out.println("Reversed Array is: ");
        printArray(arr);
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        //array1fnc(arr1, 1, 7);
        array1fnc2(arr1);
        
    }


    
}
