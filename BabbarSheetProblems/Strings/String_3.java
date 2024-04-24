package interviewquestions.BabbarSheetProblems.Strings;

import java.util.HashMap;

public class String_3 { //Print all the duplicates in the input string

    public static void String3_fnc1(String s){
        s = s.toLowerCase();
        
        HashMap<Character, Integer> count = new HashMap<>();
        
        // Store duplicate present in the string
        for(int i=0 ; i<s.length() ; i++){
            if(!count.containsKey(s.charAt(i))){ // ex - if count.containsKey(a) then count.put(a,1)
                count.put(s.charAt(i), 1);
            }
            else{ // if it is already contains a. then count.put(a,(count.get(a)+1)) 
                // ie. get the existing count and increase it by 1
                count.put(s.charAt(i), count.get(s.charAt(i))+1);
            }

        }

        // Print the counts where value is bigger than 1 ( duplicate)
    

        count.forEach((k,v) -> {

            if (v > 1){
                System.out.println(k + "'s count:  " + v);
            }

        });
    }


    public static void main(String[] args){

        String test = "Test String";
        String3_fnc1(test);


    }
    
}
