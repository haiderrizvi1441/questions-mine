package RandomClasses;

import java.util.ArrayList;
import java.util.List;

public class FineTest {
    
    static ArrayList<Integer> fnc1(int n){
        ArrayList<Integer> primeList = new ArrayList<>();
        List<Integer> llist = (1,2,3,4,5);
        
        return new ArrayList<>();
    }

    static boolean fnc2(int n){
        if(n<=2){
            return false;
        }
        if(n<=3){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }

        return true;


    }
    

    public static void main(String[] args){
        System.out.println("Working");
        for(int i=0;i<=20;i++){
            System.out.println("is " + i + " prime: " + fnc2(i));
        }
    }
}
