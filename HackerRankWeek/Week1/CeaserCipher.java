package HackerRankWeek.Week1;

public class CeaserCipher {
    

    public static void main(String[] args){
        
        String s = "middle-Outz";
        int n = 2; //Rotating factor
        String[] s_arr = s.split("-");
        char ch = 'd';
        int k  = ch+1-97;
        System.out.println(k);
    }
}
