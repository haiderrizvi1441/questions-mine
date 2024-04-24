package interviewquestions;

public class GCD {

    

    public static void fncGCD(int x , int y){
        int gcd = 1;
        
        for(int i=1; i<=x; i++){
            if (x%i==0 && y%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);

        
    }
    public static void main(String[] args){

        fncGCD(40, 120);

    }
    
}
