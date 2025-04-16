package java_basic;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet <Integer> ages = new LinkedHashSet<Integer>();
		
            ages.add(20);
            ages.add(18);
            ages.add(28);
            ages.add(50);
            
            for(Integer age : ages) {
            	System.out.println("People age is :" + age);
            	
            }
	}

}
