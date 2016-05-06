package prog1;
import java.util.*;

public class dai {
	public static void main(String[] args){
		
		String[] fruits = {"orange", "lemon", "mango", "apples", "banana"};
		List<String> list1 = Arrays.asList(fruits);
		
		Collections.sort(list1);
		System.out.printf("%s\n", list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.printf("%s\n", list1);
		
	}
}
