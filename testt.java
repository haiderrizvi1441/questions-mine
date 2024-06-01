import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Innertestt
 */
interface Innertestt {

	void abstractTest(int x);

	default void normalTest(){
		System.out.println("This is Default");
	}
}
public class testt { 
	
	
	public static void main(String[] args){
		
		List<Integer> al = Arrays.asList(1,4,5,6,3,3,1,2,2,1);
		
		al = al.stream().distinct().sorted(Comparator.reverseOrder()).toList();
		System.out.println(al);

		Innertestt innertestt = (int x)->System.out.println(2*x);
		



	}	


}
