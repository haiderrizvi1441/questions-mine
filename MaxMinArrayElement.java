package interviewquestions;


// to find the maximum and minimum element in an array
public class MaxMinArrayElement {

    // optimised method - O(n)
    public static void fnc1(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for(int i=0 ; i<arr.length ; i++){
            
            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
            
        }
        System.out.println("Min element of the Array: "+ min);
        System.out.println("Max element of the Array: "+ max);
        
    }

    // Simple method - sort using selection sort then give first and last
    public static void fnc2(int[] arr){

        for(int i=0 ; i<(arr.length-1) ; i++){
            int smallest = i;

            for(int j=1+i ; j<arr.length ; j++){

                if(arr[smallest] > arr[j]){
                    smallest = j;

                }

            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

        }
        System.out.println("Minimun Element: " + arr[0]);
        System.out.println("Maximum Element: " + arr[arr.length-1]);
    }

    public static void main(String[] args){
        int[] arr1 = {12,567,3,40};
        fnc1(arr1);
        fnc2(arr1);

    }
    
}
