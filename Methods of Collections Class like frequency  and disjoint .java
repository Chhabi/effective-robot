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
		System.out.println();
		
		System.out.println(Collections.frequency(list2, "google")); //returns the number of frequency of occurence
		
		//disjoint method check one collection with another and returns true if they have nothing in common
		boolean tof = Collections.disjoint(list1, list2);
		System.out.println(tof); // false means they have something in common
		
		if(tof)
			System.out.println("This list do not have anything in common");
		else
			System.out.println("This list must have something in common");
	}
	
}
