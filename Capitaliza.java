package interviewquestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Capitaliza {

    // Capitalize  the first word
    public static void fncCapitalize(String A){
        int size = A.length();
        String B = A.substring(0,1).toUpperCase() + A.substring(1,size);
        System.out.println(B); 
    }
    

    // Capitalize Each Word In String - Own method
    public static void fncCapitalizeEach(String s){
        
        String [] wordArray = s.split(" ");
        int size = wordArray.length;
        String [] CapitalArray = new String[size];

        for (int i=0 ; i<=(size-1) ; i++){
            String z = wordArray[i];
            int wordsize = z.length();
            z = z.substring(0,1).toUpperCase() + z.substring(1,wordsize) ;
            CapitalArray[i] = z;
        }
        String A = String.join(" ", CapitalArray);
        System.out.println(A);

    }
    // another method
    public static void fncCapitalizeEach2(String mystring){
        // Tackling multiple spaces
        String trim_string = mystring.replaceAll("\\s{2,}", " ").trim();

        
    }

    // capitalize only first word
    public static void fncCapitalizeFirst(String s){
        System.out.println(s.substring(0,1).toUpperCase() +  s.substring(1));
    }




    public static void main(String[] args){

        fncCapitalizeEach("hello how do you do ");
        fncCapitalizeFirst("haider is my name");
    }
}
