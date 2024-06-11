package JavaEightProgramming.ProbStatement;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    
    static String fnc1(String s){
        
        Set<Character> uniqueChars = new HashSet<>();
        s = s.toLowerCase().replace(" ","");
        for(char ch : s.toCharArray()){
            uniqueChars.add(ch);
        }
        System.out.println(uniqueChars.size());
        return "not pangram";
    }

    public static void main(String[] args){
        String s = "We promptly judged antique ivory buckles for the next prize";
        System.out.println(fnc1(s));
    }
}
