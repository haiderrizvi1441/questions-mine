package interviewquestions.Java_Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

    // MAP is used in the case of KEY VALUE PAIRS

    // KEY are always unique
    public static void main(String[] args) {
        
        Map<String, Integer> hmap = new HashMap<>();

        // ADDING
        hmap.put("One", 1);
        hmap.put("Two", 2);
        hmap.put("Three",3);
        hmap.put("Four", 4);
        hmap.put("Five", 5);

        System.out.println(hmap);

        // *** IMPORTANT *** 
        System.out.println("ITERATING USING ENTRYSET");
        // ITERATING over a map using entry set
        for(Map.Entry<String, Integer> e : hmap.entrySet()){
            System.out.println(e);

            // System.out.println("Key : " + e.getKey());
            // System.out.println("Values : " + e.getValue());

        }

        //Iterating only keys
        System.out.println("Iterating only keys");
        System.out.println(hmap.keySet());

        // Iterating with for each loop 
        System.out.println("Iterating using for each loop");
        
        for(String key : hmap.keySet()){
            System.out.println(key);
        }

        for(Integer value : hmap.values()){
            System.out.println(value);
        }

        hmap.put("Five", 25);

        System.out.println(hmap);

        // Putting new values on for same keys will overide the new value 

        // to avoid overiding in case key is already preset use putif absent

        hmap.putIfAbsent("Four", 34);

        

        System.out.println(hmap);


        // OTHER Functions

        hmap.containsKey("Six");
        hmap.containsValue(6);
        hmap.isEmpty();
        hmap.clear();

        



    }
    
}
