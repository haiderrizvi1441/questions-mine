package Neetcoode.ArrayNHashing;

import java.util.Arrays;

public class ValidAnagramEASY {
    
    
	// Leetcode = Valid Anagram ie. Contains same word with same freq
	
	// optimized
	static boolean fnc1(String a, String b){
		int[] counter = new int[26];

		if(a.length() != b.length()){
			return false;
		}

		for(int i=0;i<a.length();i++){
			counter[a.charAt(i)-'a']++;
			counter[b.charAt(i)-'a']--;
		}

		for(int x:counter){
			if(x!=0){
				return false;
			}


		}

		return true;

	
	}

	// Brute Force
	static boolean fnc2(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

		char[] arr1 = a.toLowerCase().toCharArray();
		char[] arr2 = b.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
		if(Arrays.equals(arr1, arr2)){
			return true;
		}
		else{
			return false;
		}
    }

    public static void main(String[] args){
        String a = "nition";
		String b = "nitin";

        System.out.println(fnc1(a,b));
    }

}
