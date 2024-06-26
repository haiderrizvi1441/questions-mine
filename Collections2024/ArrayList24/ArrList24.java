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
        int[] arr = {1,2,3,4};
        int i=5;
        int j = 2;
        int x = 0;
        x = (i+j)%2==0 ? 1 :2;
        System.out.println(x);

        return result;
    }
    

    public static void main(String[] args) {
        String Address = "151/1223-A Dholakpur, ChammkChallo, Lucknow , 226018, Uttar Pradesh, t3w63674,4567876543";
        System.out.println(givePincode(Address));
    }

}
