package Neetcoode.TwoPointer;

public class ValidPalindromeEASY {
    
    static boolean fnc1(String s){
        // Removing the non alphabet
        String regex = "[^a-zA-Z]";
        String new_s = s.replaceAll(regex,"");
        new_s = new_s.toLowerCase();
        int len = new_s.length();
        char[] char_arr = new char[len];
        for(int i=0;i<len;i++){
            char_arr[i] = new_s.charAt((len-1)-i);

        }
        
        String res = new String(char_arr);
        System.out.println("Res "+res);
        
        if(res.equals(new_s)){
            return true;
        }

        System.out.println(new_s);
        return false;
    }
    
    public static void main(String[] args){

        String s = "Nitin";
        System.out.println(fnc1(s));

    }
}
