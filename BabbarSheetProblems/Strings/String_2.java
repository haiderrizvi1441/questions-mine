package interviewquestions.BabbarSheetProblems.Strings;


// Check for palindrome
public class String_2 {

    public static void String_fnc1(String a){
        //  palindrom if string == reverse string
        int size = a.length();
        // lowercase
        a = a.toLowerCase();
        

        char[] ch = new char[size];

        for(int i=0 ; i<size ; i++){
            ch[i] += a.charAt(size-1-i);
        }

        String b = new String(ch);

        if(a.equals(b)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }


        
    }
    public static void main(String[] args){

        String_fnc1("jitij");



    }
    
}
