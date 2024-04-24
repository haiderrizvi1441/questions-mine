package interviewquestions;

public class PalindromeString {

    // Using String Builder
    public static void fncStringPalindrome(String a){
        
        // Using string builder for reversal
        // always convert back to String 
        String b = new StringBuilder(a).reverse().toString();

        // comparsion
        if(b.equals(a)){
            System.out.println("A Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
    // using emtpy string and adding with loop
    public static void fncStringPalindrome2(String a){
        // Creating an empty String
        String b = "";

        // filling in reverse with help of loop
        int stringSize = a.length();
        //loop
        for(int i=(stringSize-1) ; i>=0 ; i-- ){

            b = b + a.charAt(i);
        }

        // comparison
        if(a.equals(b)){
            System.out.println("A Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }

    public static void main(String[] args){

        fncStringPalindrome2("madam");
        fncStringPalindrome("zack");
        fncStringPalindrome("nitin");
        fncStringPalindrome2("cody");

    }
    
}
