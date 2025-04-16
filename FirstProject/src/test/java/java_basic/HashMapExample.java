package java_basic;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Integer> flowers = new HashMap<>();
		
		flowers.put("Rose",20);
		flowers.put("Tulip", 8);
		flowers.put("Lily", 15);
		flowers.put("Daisy", 20);
		flowers.put("Sunflower", 5);
		flowers.put("Orchid", 9);
		flowers.put("Marigold", 25);
		
		for(String flower : flowers.keySet()) {
			System.out.println("Flower:" + flower + ", Price:" + flowers.get(flower));
			
		}
	}
	
	

}
