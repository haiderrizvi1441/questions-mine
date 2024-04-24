package interviewquestions.BabbarSheetProblems.Arrays;

import java.util.Arrays;

// Kth Largest and smallest element in the array
public class Array_3 {

    public static void array3fnc1(int[] arr, int k){
        int size = arr.length;

        for(int i=0 ; i<size-1 ; i++){

            for(int j=1+i ; j<size ; j++){
                int temp;
                if(arr[j] > arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));

        // for printing the kth max and min
        System.out.println("Kth Biggest element: " + arr[k-1]);
        System.out.println("Kth Smallest element: " + arr[(size-k)]);
    }
    public static void main(String[] args){

        int[] array_1 = {34,2,67,8,9,345,77,36,32,69,5,78,344,70,40};
        array3fnc1(array_1, 1);

    }
    
}
