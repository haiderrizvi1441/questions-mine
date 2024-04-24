

package interviewquestions.Data_Structures.Arrays;

import java.util.Scanner;

public class twodarray_basics {
    
    public static void main(String[] args){

        // declaring a 2d array
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows : ");
        int rows = sc.nextInt();
        System.out.println("Columns : ");
        int cols = sc.nextInt();
        int [][] matrix1 = new int [rows][cols];

        // Taking INPUT
        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<cols ; j++){
                System.out.println("Element ("+i+","+j+"): ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Printing Output
        for(int i=0;i<rows;i++){
            for(int j=0 ; j<cols ; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }



    }
}
