package Neetcoode.ArrayNHashing;

import java.util.HashMap;

public class ContainsDuplicateEASY {
    
    	
	// LeetCode - Contains Duplicate
	static boolean fnc1(int[] nums){
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(map.containsValue(nums[i])){
				return true;
			}
			else{
				map.put(i,nums[i]);
			}
		}
		return false;

	}


    public static void main(String[] args){
        int[] nums = {1,2,3,4,1};
        System.out.println(fnc1(nums));
    }

}
