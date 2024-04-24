package interviewquestions.BabbarSheetProblems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//Find the Union and Intersection of the two sorted arrays.
public class Array_6 {

    // Union
    // SET method - problem is it does not work in case of multiple same elements
    // create an set and feed both arrays into it , it does not take duplicates so it will print the union
    public static void arrayunion(int[] a, int n, int[] b, int m){

        // set does not contain duplicate values hence best for union
        HashSet<Integer> s = new HashSet<>();

        // feeding first array
        for(int i=0 ; i<n ; i++){
            s.add(a[i]);
        }

        // feeding second array

        for(int i=0 ; i<m ; i++){
            s.add(b[i]);
        }
        
        // printing the result
        System.out.println("Array 1: " + Arrays.toString(a));
        System.out.println("Array 2: " + Arrays.toString(b));

        System.out.println("Union: " + s);
        System.out.println("Resultant Array size: " + s.size());


    }

    // Intersection
    public static void arrayintersection(int[] a, int m, int[] b, int n){
        ArrayList<Integer> arr1 = new ArrayList<>();

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                
                // iterate each element of arr1 with arr2 and add arr[i] to arraylist if arr[i] contains in arr2.

                if(a[i] == b[j]){
                    arr1.add(b[j]);
                }

            }
        }
        System.out.println("The array intersection is: " + arr1);
    }


    // METHOD FOR NON DISTINCT ALSO
    // union
    public static void nondistinctarr(int[] a, int m, int[] b, int n){

        a = helpersort(a);
        b =helpersort(b);

        
        
    }


    
    
 
    // helper method for sorting
    public static int[] helpersort(int[] arr){
        for(int i=0 ; i<(arr.length) ; i++){
        
            for( int j=0 ; j<arr.length ; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        
        return arr;
    }
    public static void main(String[] args){
        int[] arr1 = {4,7,3,1,2,9,3};
        int[] arr2 = {3,4,6,9};
        // arrayunion(arr1, arr1.length, arr2, arr2.length);
        // arrayintersection(arr1, arr1.length, arr2, arr2.length);
        

    }
    
}
