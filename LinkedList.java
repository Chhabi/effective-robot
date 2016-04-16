import java.util.*;

public class Chhabi {
	public static void main(String[] args){
		
		String[] things = {"banana","choko", "rice", "fish","apple"};
		List<String> list1 = new LinkedList<String>();
		
		for(String x: things )
			list1.add(x);
			
		String[] things2 = {"micorwave", "oven"};
		List<String> list2 = new LinkedList<String>();
		
		for(String y: things2 )
			list2.add(y);
		
		list1.addAll(list2);
		list2 = null;
		
		//call methods
		PrintMe(list1);
		removeStuff(list1, 2,4);
		PrintMe(list1);
		reverseMe(list1);	
	}
	//PrintMe method
	private static void PrintMe(List<String> l){
		for(String b : l )
			System.out.printf("%s ", b);
			System.out.println();
	}
	
	//removeStuff method
	private static void removeStuff(List<String> l, int from, int to){
		    //fromIndex inclusive, toIndex exclusive
			l.subList(from, to).clear();
	}
	
	//reverseMe method
	private static void reverseMe(List<String> l){
		ListIterator<String> bobby = l.listIterator(l.size());
		while(bobby.hasPrevious())
			System.out.printf("%s ", bobby.previous());
	}
}
