package interviewquestions;

import java.util.Arrays;

public class Anagram {

    public static void fncAnagram(String a, String b){

        // to remove the space and remove case
        a.replace(" ", "").toLowerCase();
        b.replace(" ","").toLowerCase();

        // Creating char array
        char [] c = a.toCharArray();
        char [] d = b.toCharArray();

        // Sorting
        Arrays.sort(c);
        Arrays.sort(d);

        // Comparsion

        if(Arrays.equals(c, d)){
            System.out.println("It is an Anangram");
        }
        else{
            System.out.println("Not an Anagram");
        }


    }

    public static void main(String[] args){

    }
    
}
