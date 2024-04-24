package interviewquestions.Java_Collections.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapBasics {
    
    // TREE MAP is same as HASH MAP but it sorts using binary search tree

    // It is sorted on basis of keys
    public static void main(String[] args){

        Map<String, Integer> tmap = new TreeMap<>();

        tmap.put("Eleven", 11);
        tmap.put("Twelve", 12);
        tmap.put("Thirteen", 13);
        tmap.put("Fourteen", 14);
        tmap.put("Fifteen", 15);

        tmap.remove("Twelve");

        System.out.println(tmap);

    }
}
