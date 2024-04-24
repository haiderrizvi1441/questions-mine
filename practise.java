package interviewquestions;

import java.util.Arrays;

public class practise {

    static void sort_helper(int[] arr){
        for(int i=0 ; i<arr.length-1 ; i++){
            int smallest = i;
            for(int j=1+i ; j<arr.length ; j++){
                if(arr[smallest] > arr[j]){
                    int temp = arr[smallest];
                    arr[smallest] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("The sorted Array : "  + Arrays.toString(arr));
    }
    public static void main(String[] args){

        int[] arr1 = {7,6,45,3,678,4,3,355,4,3};
        sort_helper(arr1);


    }
    
    
}
