package interviewquestions;

public class factorial {

    public static void printFactorial(int n){
        int factorial = 1;

        for(int i=n ; i>=1 ; i--){
            factorial *= i;
             
        }   
       System.out.println(factorial);
    }
 
    public static void main(String[] args){

        printFactorial(6);


    }
}
