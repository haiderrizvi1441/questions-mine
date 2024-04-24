package interviewquestions;

public class reverseAString {

    // helper method to convert char array toString
    public static String toString(char[] a){

        String string = new String(a);
        return string;
        
    }

    // my method using above helper class
    public static void fnc1(String s){
        int size = s.length();
        
        char [] charArray = new char[size];
        for(int i=0 ; i<size ; i++){
            charArray[i] += s.charAt(size-1-i);
        }

        System.out.println(toString(charArray));

        
    }

    public static void main(String[] args){

        // Using String Builder 
        StringBuilder sb = new StringBuilder("hello");

        System.out.println("Input : " + sb);

        for(int i=0 ; i < (sb.length()/2) ; i++){
            
            int front = i;
            int back = sb.length() - 1 - i ; // last element every loop 5 - 1 - 0 = 4 in i=0

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            // changing using setchar
            // set front as backchar
            sb.setCharAt(front, backChar);
            // set back as FrontChar
            sb.setCharAt(back, frontChar);
        }

        System.out.println("Output : " + sb);

        fnc1("Yellow");

    }
    
}
