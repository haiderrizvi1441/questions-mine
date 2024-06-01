package YoutubeInterv;

/* 
 Write a Fn that takes a string of Lowercase English alphabet letters and returns the index of string's first non repeating character. 
The First non repeating charecter that appear only once in the string.
If there is no non repeating charecter , return -1
ex: Input : abcdcaf , Output = 1
    Input : aocaoc, Output = -1
*/
public class One {
    
    static int fnc1(String str){
        int[] alp_arr = new int[26];

        for(char ch : str.toCharArray()){

            alp_arr[ch-'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(alp_arr[str.charAt(i) -'a']==1){
                return i;
            }

         
        }

        return -1;

    }

    public static void main(String[] args){
        String s1= "tabbccxdaf";
        System.out.println(fnc1(s1));
    }

}
