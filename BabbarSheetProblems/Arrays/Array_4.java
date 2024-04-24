package interviewquestions.BabbarSheetProblems.Arrays;

import java.util.Arrays;

//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

// DNF (Dutch National Flag)
public class Array_4 {

    //print array helper function
    public static void printArrs(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] +  " ");
        }
    }
    // DNF Method
    public static void array4fnc1(int[] arr){
        int size = arr.length;
        int low = 0;
        int mid = 0;
        int high = size-1;

        // cases
        while(mid<=high){
            // if mid=0 , mid swaps low , mid++ low++ 
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            
            // if mid=1 , mid++
            if(arr[mid]==1){
                mid++;
            }

            // if mid =2 , mid swaps high , high --
            if(arr[mid] == 2){
                
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        printArrs(arr);

    }
    // test dnf using switch
    public static void testfnc1(int[] arr){

        int low = 0;
        int mid = 0;
        int high = arr.length -1;
        int temp;


        while(mid <= high){
            switch(arr[mid]){

                case 0:{ // swap lo and mid , low ++ mid ++
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }

                case 1:{ // mid ++
                    mid++;
                    break;
                }

                case 2:{ // swaps mid and high, high--;
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;

                }
            }
            
        }
        printArrs(arr);
    }
    // Brute Force
    public static void fnc2(int[] arr){
        System.out.println(Arrays.toString(arr));
        int zerocounter = 0;
        int onecounter = 0;
        int twocounter = 0;
        int size = arr.length;

        for(int i=0 ; i<size ;i++){
            if(arr[i] == 0){
                zerocounter++;
            }
            if(arr[i] == 1){
                onecounter++;
            }
            if(arr[i] == 2){
                twocounter++;
            }

        }
        System.out.println(zerocounter);
        System.out.println(onecounter);
        System.out.println(twocounter);
        
        int[] res = new int[size];
        // input
        for(int i=0 ; i<zerocounter ; i++){
            res[i] = 0;
        }
        for(int i=zerocounter ; i<(onecounter+zerocounter) ; i++){
            res[i] = 1;
        }
        for(int i=(zerocounter+onecounter) ; i<size ; i++){
            res[i] = 2;
        }

        System.out.println(Arrays.toString(res));


    }

    public static void main(String[] args){

        int[] arr1 = {2,0,1,2,1,2,0};
        //fnc2(arr1);

        array4fnc1(arr1);

        //testfnc1(arr1);

    }
    
}
