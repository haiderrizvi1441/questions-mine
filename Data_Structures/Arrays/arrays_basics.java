package interviewquestions.Data_Structures.Arrays;

import java.util.Scanner;

public class arrays_basics {

    // to take input from the user and print won if there is a lucky number in the array
    public static void fncluckynumber(int n){
        int[] ticket_no = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<4 ; i++){
            System.out.println("Enter the "+(i+1)+" number: ");
            ticket_no[i] = sc.nextInt();
        }sc.close();
        // checking for the number
        for(int i=0; i<4 ; i++){
            if(ticket_no[i]==n){
                System.out.println("Congrats, you have got the lucky number");
            }
        }
        
    }
    public static void main(String[] args){

        // // Creating an EMPTY array
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size for the Array: ");
        // int size = sc.nextInt();
        // int[] intArray1 = new int[size];

        // // Declaring an PRE Defined Array
        // int[] intArray2 = {1,2,3,4,5};

        // System.out.println("Enter the values for the array");
        // for(int i=0;i<size;i++){
        //     System.out.println("Enter the values for " + i + " : " );
        //     intArray1[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(intArray1));
        fncluckynumber(7);
    }
    
}
