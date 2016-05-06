package prog1;
import java.util.*;

public class dai {
	public static void main(String[] args){
		
		//create an array and convert to list
		String[] stuff = {"apples", "beef", "rice", "chicken"};
		List<String> list1 = Arrays.asList(stuff);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("youtube");
		list2.add("google");
		list2.add("bbc");
		
		for(String x: list2)
			System.out.printf("%s ", x);
		
		Collections.addAll(list2, stuff);
		System.out.println();
		
		for(String x: list2)
			System.out.printf("%s ", x);
		
	}
	
}
