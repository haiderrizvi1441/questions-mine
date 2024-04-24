package interviewquestions.Java_Collections.Sets;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetBasics {

    // TreeSet is also same but it gives array in SORTED format

    public static void main(String[] args){

         // order here can also be changed using a comparator
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());

        treeSet.add(34);
        treeSet.add(45);
        treeSet.add(4);
        treeSet.add(17);
        treeSet.add(1);
        treeSet.add(244);


        System.out.println(treeSet); // it displays in sorted form
    }   


    
}
