package java_basic;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> colors = new HashSet<String>();
		colors.add("White");
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Red");
	    
	    for (String color : colors) {
	      System.out.println(color);
	    }
      
      
	}

}
