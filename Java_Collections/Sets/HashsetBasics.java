package interviewquestions.Java_Collections.Sets;

import java.util.HashSet;
import java.util.Set;

// Set only has unique values

// Order is not defined , for defined order , use LinkedHashedSet
public class HashsetBasics {

    public static void main(String[] args){

        Set<Integer> hashSet = new HashSet<>();

        // as the element are added , their unique hashes are generated

        // ADDITION
        hashSet.add(12);
        hashSet.add(5);
        hashSet.add(67);
        hashSet.add(123);
        hashSet.add(98);
        hashSet.add(1);
        hashSet.add(12);
        hashSet.add(67);


        System.out.println(hashSet.size());  
        System.out.println(hashSet);

        // Removal
        hashSet.remove(12);
        System.out.println(hashSet);

        // Other Features
        hashSet.contains(45);
        hashSet.isEmpty();

        hashSet.clear();

    }
    
}
