import java.util.*;

public class Chhabi {
	public static void main(String[] args){
		
		String[] things = {"banana","choko", "rice", "fish","apple"};
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(things));
		
		thelist.add("sugar");
		thelist.addFirst("firstthing"); //add at the beginning
		
		//convert back to an array
		things = thelist.toArray(new String[thelist.size()]);
		
		for(String x: things )
			System.out.printf("%s ", x);
	}
}
