package HackerRankWeek.Week1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxSumok {
    
    

    static void hashMapCounter(List<String> strings){
        HashMap<String,Integer> countMap = new HashMap<>();
        for(String str : strings){
            if(countMap.containsKey(str)){
                countMap.put(str, countMap.get(str)+1);
            }
            else{
                countMap.put(str,1);
            }
        }

        System.out.println(countMap.toString());
    }
    
    static List<Integer> fnc1(List<String> strings, List<String> queries){
        
        // Create a HashMap to store strings count
        HashMap<String,Integer> mymap = new HashMap<>();
        for(String x: strings){
            if(mymap.containsKey(x)){
                mymap.put(x,mymap.get(x)+1);
            }
            else{
                mymap.put(x,1);
            }
        }
        // Create a result array
        int[] results = new int[queries.size()];
        
        // Iterate throught queries array and check if queries[element] is present in map, if not default to 0
        for(int i=0;i<queries.size();i++){
            results[i] = mymap.getOrDefault(queries.get(i), 0);
        }

        List<Integer> resultList = 
        return resultList;
    }
    public static void main(String[] args){

        // key = count , value = elements
        HashMap<Integer,Integer> mymap = new HashMap<>();
        int[] arr = {1,2,3,4,3,2,1};
        int ress = 0;
        for(int x : arr){
            ress ^= x;
            System.out.println("Ress:" + ress);
        }


  
        // String s = "26:55:45PM";
        // int hour = Integer.parseInt(s.substring(0,2));
        // int minutes = Integer.parseInt(s.substring(3, 5));
        // int seconds = Integer.parseInt(s.substring(6, 8));
        // String period = s.substring(8);
        // System.out.println("Hours: " + hour + " , Minutes: " + minutes + " , Seconds: " + seconds + " ,Period: " + period);

        // List<String> strings = Arrays.asList("ab","ab","abc");
        // List<String> queries = Arrays.asList("ab","abc","bc");
        // System.out.println(fnc1(strings, queries));

        

        
    }
}
