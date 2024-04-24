package interviewquestions;

public class neonnumber {

    static void fnc1(int n){
        int sqr = n*n;
        int sum=0;

        while(sqr > 0){
            int rem = sqr % 10;
            sum += rem;
            sqr /= 10;
            
        }

        if(sum == n){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not a Neon Number");
        }

        
    }
    public static void main(String[] args){

        fnc1(9);
    }
    
}
