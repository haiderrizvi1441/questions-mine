package interviewquestions.Data_Structures.Arrays;

import java.util.Scanner;

public class ques1 {
    // Take a matrix as input from user. Search for a given number x and print the indices at which it occurs

    public static void fnc1(int n){
        Scanner sc = new Scanner(System.in);
        // INPUT
        System.out.println("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns: ");
        int cols = sc.nextInt();
        int [][] matrix2 =  new int[rows][cols];

        // loop for input 
        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<cols ; j++){
                System.out.println("Enter the value for ("+ i + "," + j + ") : " );
                matrix2[i][j] = sc.nextInt();
            }
        }
        // loop for output
        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<cols ; j++){
                System.err.print(matrix2[i][j] + "  ");

            }System.out.println();
            System.out.println();
        }

        // loop for result
        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<cols ; j++){
                if(matrix2[i][j] == n){
                    System.out.println("Number was found at ("+i+","+j+")");
                }
                else{
                    System.out.println("Number not found");
                }
            }
        }
        

    }

    public static void main(String[] args){
        fnc1(5);

        
    }
}
