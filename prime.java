package interviewquestions;

public class prime {
    // to check whether the input is prime or not
    public static void fncprime(int n){
        int counter = 0;

        for(int i=1 ; i<=n ; i++)
        {
            if(n%i==0)
            {
                counter++;
            }
        }
        if(counter==2)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
    }
    // give all prime number in range n
    public static void fncprime2(int n){
        System.out.println(1);
        for(int i=1 ; i<=n ; i++){
            int counter = 0;
            for(int j=1 ; j<=i ; j++){
                if(i%j==0){
                    counter++;
                }
            
                
            }
            if(counter==2){
                System.out.println(i);
            }
        }
        
    }

    public static void main(String[] args){

        fncprime2(100);

    }
    
}
