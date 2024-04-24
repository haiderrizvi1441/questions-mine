package interviewquestions;


public class JavaStringToken {

    // HackerRank Question : Java String Token
    public static void fncStringToken(String s){

        // tackling edge cases
        s = s.trim(); // whitespaces
        
        if(s.length()==0){
            System.out.println(0);
            return;
        }

        String [] words = s.split("[^a-zA-Z]+");
        int size = words.length;

        System.out.println(size);

        for(int i=0 ; i<size ; i++){
            System.out.println(words[i]);
        }

    }


    public static void main(String[] args){

        String x = "Hello , my name isn't John!";
        fncStringToken(x);

    }
    
}
