package collections_examples;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Apple");	
		al.add("Orange");	
		al.add("Banana");	
		al.add("Pineapple");	
		al.add("Grape");	
		al.add("Kiwi");	
		al.add("Coconut");	
		
		System.out.println(al);
		System.out.println("Size of array is : "+al.size());
		
		al.remove(6);
		al.remove(3);
		System.out.println(al.contains("Apple"));
		
		
		for(String fruits : al) {
			System.out.println(fruits);
		}
		
		
		

	}

}
