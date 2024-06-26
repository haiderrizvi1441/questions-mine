package YoutubeInterv.InntJava8;

import java.util.Arrays;

public class SumOfArr {
    
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        int res = Arrays.stream(arr).sum();
        int res2 = Arrays.stream(arr).reduce(0, (a,b) -> (a+b));
        System.out.println(res);
        System.out.println(res2);


    }
}
