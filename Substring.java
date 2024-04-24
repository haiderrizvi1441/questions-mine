package interviewquestions;

import java.util.SortedSet;
import java.util.TreeSet;

public class Substring {
    
    
    // Hackerrank question
    // to print string from given start and end
    public static void fncSubstring(String s, int start, int end){

        System.out.println(s.substring(start,end));

    }



    // HackerRank Question - 
    // String s , int k , find the smallest and largest substring in lexographical order of length k
    // Divide string in K and find smallest and largest
    public static void fncSubstringlex(String s, int k){

        // We will used Sorted set - TreeSet
        SortedSet<String> s1 = new TreeSet<String>();
        int size = s.length();

        //loop
        for(int i=0;i<=(size-k) ; i++){
            // add the substring(1,k) to s1
            s1.add(s.substring(i, k+i));
            // 0,3(012) - 1,4(123) - ,2-5(234)

        }
        // print the sorted set
        System.out.println(s1);

        // Print the smallest and largest of the set
        System.out.println("smallest : " + s1.first());
        System.out.println("Largest : " + s1.last());




    }

    public static void main(String[] args){

        String a = "HaiderRizvi";
        fncSubstring(a, 1, 8);

        fncSubstringlex(a, 3);

    }
    
}
