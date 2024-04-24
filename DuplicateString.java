package interviewquestions;

import java.util.HashMap;

public class DuplicateString {

    public static void fnc1(String s){


        s = s.toLowerCase();
        // Create a HashMap to map alphabet to key and their count to values
        HashMap<Character, Integer> count = new HashMap<>();
        
        // if in count , alphabet is present then increase the count in values
        //  if present then add the character as keys and their counts as values
        
        for(int i=0 ; i<s.length() ; i++){
            if(!count.containsKey(s.charAt(i))){
                count.put(s.charAt(i), 1);
            }
            else{
                count.put(s.charAt(i), count.get(s.charAt(i))+1);

            }
        }

        // printing the count values
        count.forEach((key , value) -> {
            // print if count > 1 (duplicate)
            if( value > 1){
                System.out.println(key + "'s count : " + value);
            }
        });



        
    }
    public static void main(String[] args){

        fnc1("Draco Draco");
        
    }
}
