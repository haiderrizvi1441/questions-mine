package interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Given five positive integers, find the minimum and maximum values that can be calculated by 
// summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
// LONG will be used instead of INT to cover all the testcases
public class maxmin {

    public static void maxminfnc(List<Integer> arr){
        // sorting the array
        Collections.sort(arr);
        
        int size = arr.size();

        // giving the min value. ie sum of first four
        long min =0;
        for(int i=0 ; i<size-1 ; i++){
            long element = arr.get(i);
            min += element;

        }
        System.out.print(min + " ");

        // Max value . ie. the sum of the last four
        long max =0;
        for(int i=1 ; i<size ; i++){
            long element = arr.get(i);
            max += element;
        }

        System.out.print(max  );
    }
    public static void main(String[] args){

        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1,5,2,4,3));

        maxminfnc(arr1);

    }
    
}
