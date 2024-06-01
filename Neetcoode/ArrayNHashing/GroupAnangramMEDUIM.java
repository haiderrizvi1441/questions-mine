package Neetcoode.ArrayNHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnangramMEDUIM {
    
    	// GROUP ANAGRAM
	
	static List<List<String>> fnc1(String[] strs){
		HashMap<String, List<String>> map = new HashMap<String,List<String>>();

		for(String s:strs){
			char[] sorted_arr = s.toCharArray();
			Arrays.sort(sorted_arr);
			String sorted_str = new String(sorted_arr);
			// Check if key is present, if not insert it along with empty arrlist to enter strings
			if(!map.containsKey(sorted_str)){
				map.put(sorted_str, new ArrayList<>());
			}
			// then as either the array will be present or newly created, enter the orignal str
			map.get(sorted_str).add(s);
		}
			
		return new ArrayList<>(map.values());

		
	}
 


	public static void main(String [] args ){
		
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(fnc1(strs));
	
	}
}
