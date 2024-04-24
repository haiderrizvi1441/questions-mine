package interviewquestions.Data_Structures.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

// ARRAY is continious while ARRAYLIST is not continious.
// Array has fixed size but ARRAYLIST does not
// Array stores primitive datatype and objects while ARRAYLIST only stores objects
// Arrays stored in STACK, ARRAYLIST is stored in HEAP. 

public class linkedlistbasics {

    public static void main(String[] args){

        // Declaration
        ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // adding
        list1.add(3);
        list1.add(5);

        // adding in specific index
        list1.add(1,4);

        // SET- set at element at an index
        list1.set(0,8);

        // SORTING
        Collections.sort(list1);

        // GET
        list1.get(0);

        // Delete 
        list1.remove(1);

        // Printing
        System.out.println(list1);

        // Iterating
        for(int i=0 ; i<list1.size() ; i++){
            System.out.println(list1.get(i));
        }
    }

    


    
}
