package prog1;
import java.util.*;

public class dai {
	public static void main(String[] args){
		
		//priority queue
		PriorityQueue<String> q = new 	PriorityQueue<String>();
		q.offer("first");
		q.offer("second");
		q.offer("third");
		
		System.out.printf("%s ", q);
		System.out.println();
		
		System.out.printf("%s ", q.peek()); //looks at the element with highest priority
		System.out.println();
		
		q.poll(); //automatically search for highest priority element and removes it
		System.out.printf("%s ", q);
		
	}
}
