package JavaEightProgramming;

import java.util.Arrays;
import java.util.List;

public class JavaEightBasics {
    


    public static  void main(String[] args){

        // // Easy Demonstation of Lambda
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        // nums.forEach(n -> System.out.println("n : "+ n));
        List<Integer> newList = nums.stream()
                                    .map(n -> n*2)
                                    .filter( n ->n > 5)
                                    .toList();
        System.out.println(newList);

        // Reduce the list 
        int result = newList.stream().reduce(0,(c,e) -> (c+e));
        System.out.println(result);

    }
}
