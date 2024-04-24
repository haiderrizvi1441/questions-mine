package interviewquestions.Data_Structures.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

// Array is non mutable , ArrayList is.
// Array is stored in STACK memory, ArrayList is stored in HEAP Memory.
// Array is continious , ArrayList is not.


public class arraylist {

    public static void main(String[] args){

        ArrayList<Integer> list1 = new ArrayList<>();

        // Adding 
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        // Adding at an specific index
        list1.add(3,7);

        // SET
        list1.set(0, 10);

        //GET
        list1.get(0);
        list1.get(1);

        // size
        list1.size();


        // SORTING
        Collections.sort(list1);


        // Iterating
        for(int i=0 ; i<list1.size() ; i++){
            System.out.println(list1.get(i));
        }
    }
    
}
