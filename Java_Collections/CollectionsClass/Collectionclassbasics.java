package Java_Collections.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collectionclassbasics {

    /// Use to help with collections

    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        
    
        list1.add(32);
        list1.add(35);
        list1.add(36);
        list1.add(37);
        list1.add(38);
        list1.add(38);
        list1.add(40);

        // Max
        System.out.println(Collections.max(list1));

        // Min
        System.out.println(Collections.min(list1));

        // Frequency
        System.out.println(Collections.frequency(list1, 38));

        //Sort 
        Collections.sort(list1, Comparator.reverseOrder());
        System.out.println("SortedList: " +list1);


        


    }
    
}
