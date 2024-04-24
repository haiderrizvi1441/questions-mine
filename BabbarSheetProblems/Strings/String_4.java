package interviewquestions.BabbarSheetProblems.Strings;

import java.util.LinkedList;
import java.util.Queue;

public class String_4 { // TO check if strings are rotation of each other
    
    /* METHOD 1 
    s1 = "ABCD"
    s2 = "DABC"

    temp = s1 + s1;
    ie. "ABCDABCD"

    the s2 will be a substring of temp then they are rotation of each other or not;
    also , length of both should be same 
    
    */  
    
    public static void string4_fnc1(String s1, String s2){
        // .indexOf gives the postion of s2 present and returns -1 in case it is not present
        // it is case senstive
        if((s1.length() == s2.length()) && (s1+s1).indexOf(s2) != -1){
            System.out.println("Rotation of string");
        }
        else{
            System.out.println("Not a rotation");
        }
    }

    /*METHOD 2 USING QUEUE (Linked List)
     * enter the String 1 in queue1
     * enter the Strinf 2 in queue2
     * Keep popping q2 and pushing it back until the length of string 
     * popping and pushing element one by one will rotate the queue
     * Rotation if q2 becomes equal to q1 else not     */

     static void fnc2(String s1, String s2){

        if(s1.length() != s2.length()){
            System.out.println("Not a Rotation");
            return;
        }
        boolean isRotation = false;

        Queue<Character> q1 = new LinkedList<>();
        for(int i=0 ; i<s1.length() ; i++){
            q1.add(s1.charAt(i));
        }

        Queue<Character> q2 = new LinkedList<>();
        for(int i=0 ; i<s2.length() ; i++){
            q2.add(s2.charAt(i));
        }
        int k = s2.length();
        while(k> 0){
            k--;
            
            // adding and removing will start rotating the array
            char ch = q2.peek();
            q2.remove();
            q2.add(ch);

            if(q2.equals(q1)){
                isRotation = true;
                
            }
            
        }
        if(isRotation=true){
            System.out.println("Rotation");
        }
        else{
            System.out.println("Not Rotation");
        }
                


     }
    public static void main(String[] args){

        String a = "ABCD";
        String b = "CBAB";
        String c = "DABC";
        fnc2(a, b);


    }
}
