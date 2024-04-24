package interviewquestions;

import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class DidiPractisequestions {

    // 1 - Enter 3 numbers from the user & make a function to print their average.
    public static void fnc1(int a, int b, int c){
        int d = (a + b + c)/3;
        System.out.println("The average of "+a+", "+b+","+c+" is: "+d);
    }



    // 2 - Write a function to print the sum of all odd numbers from 1 to n.
    public static void fnc2(int n){
        for(int i=1 ; i<=n ; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
            
        }
    }



    // 3 - Write a function which takes in 2 numbers and returns the greater of those two.
    public static void fnc3(int a, int b){
        if (a > b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }



    // 4 - Write a function that takes in the radius as input and returns the circumference of a circle.
    public static void fnc4(double x){
        double pi = 3.14;
        double circum = 2 * pi * x;
        System.out.println(Math.round(circum));
    }



    // 5 - Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static void fnc5(int age){
        String res =(age>18) ? "Eligible": "Not Eligible";
        System.out.println(res);
    }



    // 6 - Write an infinite loop using do while condition.
    public static void fn6(int x){
        do{
            System.out.println("This is an infinite loop");
        }while(true);
    }


    
    // 7 - Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    public static void fn7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to input");
        int x = sc.nextInt();
        
        int [] dataArray = new int[x];
        for (int i=0 ; i<=(x-1) ; i++){
            System.out.println("Enter the number " + (i+1) + " : " );
            dataArray[i] = sc.nextInt();
        }
        
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for(int i : dataArray){
            if(i == 0){
                zeroCount ++;
            }
            else if(i<0){
                negCount ++;
            }
            else{
                posCount ++;
            }
        }
        System.out.println("The number of zero's entered: " + zeroCount);
        System.out.println("The number of positive numbers: "+ posCount);
        System.out.println("The number of negative numbers : " + negCount);

        
    }

    // 8 - Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x ^ n.
    public static void fn8(int x, int n){
        System.out.println("Base: " + x);
        System.out.println("Power: " + n);

        double y = Math.pow(x, n);
        System.out.println("The value is : " + y);
    }

    // 9 - Write a function that calculates the Greatest Common Divisor of 2 numbers.
    public static void fn9(int x, int y){
        int gcd = 1;
    

        for (int i=1 ;  i<=x ; i++){
            if(x%i==0&&y%i==0){
                gcd = i;
            }

        }
        System.out.println("Greateest common divisor between "+x+" and "+y+" is:"+gcd);
        
    }






    // 10 - Write a program to print Fibonacci series of n terms where n is input by user .
    public static void fn10(int n){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i=0 ; i<=n ; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }









    public static void main(String[] args){

        fn9(50,60);

    }
    
}
