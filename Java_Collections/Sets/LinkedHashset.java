package interviewquestions.Java_Collections.Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {
    

    // same as HASH SET but order is maintained.


    public static void main(String[] args){

        Set<Integer> lhashset = new LinkedHashSet<>();

        lhashset.add(45);
        lhashset.add(2);
        lhashset.add(3);
        lhashset.add(4);
        lhashset.add(5);
        lhashset.add(6);

        // it is just ordered, everything else is same

        System.out.println(lhashset);

        
    }
}
