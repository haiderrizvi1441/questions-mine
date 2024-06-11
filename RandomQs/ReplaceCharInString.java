package RandomQs;

public class ReplaceCharInString {
    
    // Remove the given character from String
    static String fnc1(String str, char ch){
        String res = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) !=ch){
                res += str.charAt(i);
            }
        }
        return res;
    }


    // Replace the given character from String
    static String fnc2(String str, char oldChar, char newChar){
        String res = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!= oldChar){
                res += str.charAt(i);
            }
            else{
                res += newChar;
            }
        }

        return res;
    }
    public static void main(String[] args){

        System.out.println("Working");
        System.out.println(fnc1("Haider",'i'));
        System.out.println(fnc2("Haiidier",'i','o'));
    }
}
