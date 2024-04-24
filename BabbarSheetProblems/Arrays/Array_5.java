package interviewquestions.BabbarSheetProblems.Arrays;

//Move all the negative elements to one side of the array 
public class Array_5 {

    // print array function
    public static void print_array(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");

        }
    }
    //swap helper function
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Dutch National flag using two zones . low and high
    public static void arr5fnc1(int[] arr){
        int low = 0;
        int high = arr.length-1;
        
        while(low <= high){
            if(arr[low] < 0){
                low++;
            }
                
            else{
                swap(arr, low,high);
                high--;
            }
        }
        print_array(arr);

    }

    public static void testfnc(int[] arr){
        int lo = 0;
        int hi = arr.length-1;

        while(lo<=hi){
            if(arr[lo] < 0){
                lo++;
            }
            if(arr[lo] >0){
                swap(arr,lo,hi);
                hi--;
            }
        }
        print_array(arr);
    }

    public static void main(String[] args){

        int[] array1 = {2,-1,-2,-4,5,6,-5};
        arr5fnc1(array1);
        System.out.println();
        testfnc(array1);

    }
}
