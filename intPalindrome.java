package interviewquestions;

public class intPalindrome {

    public static void fncIntPalindrome(int x){

        int remainder,temp;
        int sum = 0;
        temp = x;
        
        // dividing by 10 to get remiander aka last digit and add it as first digit in sum
        // loop for revrsing string  
        while(x>0){
            remainder = x % 10;
            sum = (sum * 10) + remainder;
            x = x/10;
        }
        System.out.println("Input : " + temp);
        System.out.println("Output : " + sum);

        // Comparison
        if(sum == temp){
            System.out.println("A Palindrome");
        }
        else{
            System.out.println("Not an Palindrome");
        }

    }

    public static void main(String[] args){

        fncIntPalindrome(123456789);
        fncIntPalindrome(41214);

    }
    
}
