package interviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Given the array , provide the min and max sum of the array element
// sort the array in ascending order
// For Min Sum add all except the last element (last = largest)
// For Max Sum add all except the first element (first = smallest)

public class MaxMinArray {
    
    static void fnc1(List<Integer> arr){


        Collections.sort(arr);

        int MinSum = 0;
        for(int i=0 ; i<(arr.size()-1) ; i++){
            MinSum += arr.get(i);
        }

        int MaxSum = 0;
        for(int i=1 ; i<(arr.size()) ; i++){
            MaxSum += arr.get(i);
        }

        System.out.println("Min Sum: " + MinSum);
        System.out.println("Max Sum: " + MaxSum);
        

    }

    public static void main(String[] args){

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        fnc1(list1);
    


        
    
}
}

