package interviewquestions;

import java.util.Arrays;

public class KthMaxMinArray {
    
    public static void fnc1(int[] arr, int k){
        // Sorting the array using selection sort in descending order
        

        int size = arr.length;
        for(int i=0 ; i<size-1 ; i++){ 
            for(int j=1+i ; j<size ; j++){
                // assign Biggest element to j
                if(arr[j] > arr[i]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            } 
            
        }System.out.println(Arrays.toString(arr));
        System.out.println("Kth Biggest Element: " + arr[k-1]);
        System.out.println("Kth Smallest Element: " + arr[size-k]);

    }
    public static void main(String[] args){

        int[] arraay1 = {234,535,74756,86876,443,23,12,5,787,9,6};
        fnc1(arraay1, 1);

    }
    
}
