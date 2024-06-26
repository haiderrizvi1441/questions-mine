import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Innertestt
 */

public class testt { 
	
	
	public static void main(String[] args){
		
		String a = "rami";
		String b = "singh";
		String c= a+b;
		System.out.println(c);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a.length();i++){
			sb.append(a.charAt(i));
		}
		System.out.println(sb.toString());

		List<Integer> list = Arrays.asList(0,1,3,5,7,83,6);
		List<Integer> mylist = new ArrayList<>();
		System.out.println(mylist.size());
		
		


	}	


}
