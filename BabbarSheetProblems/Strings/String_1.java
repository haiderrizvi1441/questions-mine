package interviewquestions.BabbarSheetProblems.Strings;

// Reverse a String
public class String_1 {
    



    public static void reverseStringfnc1(String s){
        
        int size = s.length();
        char[] ch = new char[size];

        for(int i=0 ; i<size ; i++){

            ch[i] += s.charAt(size-1-i);

        }
        String string = new String(ch);
        System.out.println(string);

    }
    public static void main(String[] args){

        String s = "Hello World!";
        reverseStringfnc1(s);

    }
    
}
