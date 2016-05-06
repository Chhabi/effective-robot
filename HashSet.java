package prog1;
import java.util.*;

public class dai {
	public static void main(String[] args){
		
		//Set is like collections but can not contain duplicates
		//removes the duplicate
		
		String[] things = {"apple", "bob","banana", "apple"};
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s ", list);
		System.out.println();
		
		//Special set called hashset to remove duplicate occurence, here "apple"
		Set<String> set = new HashSet<String>(list);
		System.out.printf("%s ", set);
		
	}
}
