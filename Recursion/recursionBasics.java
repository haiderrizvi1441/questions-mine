package interviewquestions.Recursion;

public class recursionBasics {


    // A Simple recurive function  -----------------------------------------------
    static void fnc1(int n){

        if(n == 0)  // BASE CASE
            return;
        
        System.out.println(n);  // ACTION
        fnc1(n-1);  // RECURSION
    }

    // Print sum of n Natural numbers  -------------------------------------------
    static void fnc2(int i, int n , int sum){

        if(i ==n){  // BASE CASE
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i; // ACTION
        fnc2(i+1, n, sum); // RECURSION
        
    }

    // Factorial using RECURSION  ------------------------------------------
    static void fnc3(int n, int sum){
        if(n == 0){  // BASE CASE
            System.out.println(sum);
            return;
        }
        sum *= n;  // ACTION
        fnc3((n-1), sum);  // RECURSION
    }

    // Exponential power using RECURSION -----------------------------------
    static int fnc4(int x, int n){
        
        if(n==0){     // BASE CASE 1
            return 1;
        }
        if(x==0){     // BASE CASE 2
            return 0;
        }

        int XpowNm1 = fnc4(x,n-1);
        int XpowN = x * XpowNm1; 
        return XpowN;
    }   

    public static void main(String[] args){

        System.out.println(fnc4(2,3));

    }
    
}
