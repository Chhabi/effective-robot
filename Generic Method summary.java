package prog1;
import java.util.*;

public class dai {
	public static void main(String[] args){
		
		Integer[] iray = {1,2,3,4,5,6};
		Character[] cray = {'c','h','h','a','b','i'};
		
		PrintMe(iray);
		PrintMe(cray);
	}
	
	// Generic Method 
	public static <T> void PrintMe(T[] x){
		for (T gajab : x)
			System.out.printf("%s ", gajab);
		System.out.println();
	}
}
