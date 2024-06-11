package Collections2024.ArrayList24;

public class ArrList24 {

    static String givePincode(String s){

        String[] words = s.replace(" ","").split(",");
        String result = "";
        for(String word: words){
            if(word.length() == 6 && word.matches("\\d+")){
                result = word;
            }
        }
        

        return result;
    }
    

    public static void main(String[] args) {
        String Address = "151/1223-A Dholakpur, ChammkChallo, Lucknow , 226018, Uttar Pradesh, t3w63674,4567876543";
        System.out.println(givePincode(Address));
    }

}
