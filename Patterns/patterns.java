package interviewquestions.Patterns;

import java.util.Scanner;



public class patterns {

    // tri -----------------------------------------------------------
    public static void tri(int n){

        for (int i=1 ; i<=n ; i++){

            for (int j=1 ; j<=i; j++ ){
                System.out.print(" * ");
    
            }
            System.out.println(" ");
        }
    }


    // REV Triangle ----------------------------------------------------
    public static void revtri(int n){

        for(int i=n ; i>0 ; i--){
            
            for(int j=0; j<i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public static void pyra(int n){

        for(int i=0 ; i<n ; i++){
            System.out.print(" ");
        }

    }
    





    // HOLLOW RECTANGE / SQUARE ------------------------------------------------------
    public static void hollowrect(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the no of cols");
        int cols = sc.nextInt();

   

        
        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<cols ; j++){

                if(i==0 || i == (rows-1) || j == 0 || j == (cols-1) ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
                
            }System.out.println();
        }

    }





    public static void main(String[] args){
        //pyr(5);
        revtri(5);



        //hollowrect();
        

    }
}
