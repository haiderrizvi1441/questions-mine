package interviewquestions;

import org.w3c.dom.ranges.Range;

public class Armstrong {
    // to tell if the number is armstrong
    public static void fncarmstrong(int n){
        int temp, rem;
        double res=0;
        
        temp = n;
        while(temp>0){
            rem = temp%10;
            res = res + Math.pow(rem, 3);
            temp = temp / 10;
        }
        if (n==res){
            System.out.println("Armtrong");
        }else{System.out.println("Not an ArmStrong");}
    }

    // to print Armstrong number in the given range (1,n)
    public static void fnc2armstrong(int n){
        for(int i=1; i<=n ; i++){
            int temp , rem;
            double res = 0;
            temp = i;
            while(temp>0){
                rem = temp % 10;
                res = res + Math.pow(rem, 3);
                temp = temp/10;

            }
            if (res==i){
                System.out.println(i + " is an Armstrong number");
            }
        }
    }
    public static void main(String[] args){

        fnc2armstrong(1000);

    }
}
