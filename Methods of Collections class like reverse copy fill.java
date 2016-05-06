package prog1;
import java.util.*;

public class dai {
	public static void main(String[] args){
		
		//create an array and convert to list
		Character[] ray = {'p', 'w', 'n'};
		List<Character> list1 = Arrays.asList(ray);
		System.out.println("List is : ");
		output(list1);
		
	
		//reverse and print out the list
		Collections.reverse(list1);
		System.out.println("After reverse : ");
		output(list1);
		
		//create a new array and new list
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);
		
		//copy contents of list into listCopy
		Collections.copy(listCopy, list1);
		System.out.println("Copy of list : ");
		output(listCopy);
		
		//fill collections with crap
		Collections.fill(list1, 'X');
		System.out.println("After filling the list: ");
		output(list1);
		
	}
	
	//output method
	private static void output(List<Character> thelist){
	
		for(Character thing : thelist)
				System.out.printf("%s ", thing);
		
		System.out.println();
	}
	
}
