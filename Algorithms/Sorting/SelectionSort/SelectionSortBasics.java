package interviewquestions.Algorithms.Sorting.SelectionSort;

import java.util.Arrays;

// Smallest element is pushed to the first place
/*no swapping, we run the loop to iterate and get the smallest elements and send it 
   to the first place. 
   Only one swap is done per iteration
*/
public class SelectionSortBasics {
    public static void main(String[] args){

        int [] arr = {7, 8, 3, 1, 2};
        int size = arr.length;
        // time complexity = O(n^2)

        // outerloop - runs n-1 times , swapping smallest element once every run
        for(int i=0 ; i<(size-1) ; i++){
            // innerloop - runs n-1-i times , scans amd send the smallest element to arr[0]
            int smallest = i;
            for(int j=1+i ; j<(size) ; j++){ // tells the smallest and assign it to smallest
                // if arr[i] is smaller than arr[small] then (i swaps small)
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
                
            } // Swapping smallest with i -sending smallest to the left most in array in that loop
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            System.out.println(Arrays.toString(arr));
        }System.out.println("The sorted Array : " + Arrays.toString(arr));
    }

        
}

