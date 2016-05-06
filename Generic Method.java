package prog1;
import java.util.*;

public class dai {
	public static void main(String[] args){
		
		// Overloaded methods (line 15- 25)
		Integer[] iray = {1,2,3,4};
		Character[] cray = {'c','h','h','a'};
		
		PrintMe(iray);
		PrintMe(cray);
	}
	
	/*public static void PrintMe(Integer[] i){
		for (Integer x: i )
			System.out.printf("%s ", x);
		System.out.println();
	}
	
	public static void PrintMe(Character[] i){
		for (Character x: i )
			System.out.printf("%s ", x);
		System.out.println();
	}*/
	
	// Implementation of Generic methods, remove overloaded methods
	// Generic methods allows u to take any type of data
	public static <T> void PrintMe(T[] x){
		for (T gajab : x)
			System.out.printf("%s ", gajab);
		System.out.println();
	}
}
