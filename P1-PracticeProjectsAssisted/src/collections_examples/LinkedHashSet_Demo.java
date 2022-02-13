package collections_examples;

import java.util.LinkedHashSet;

public class LinkedHashSet_Demo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		lhs.add(5);
		lhs.add(10);
		lhs.add(15);
		lhs.add(20);
		lhs.add(25);
		lhs.add(25);
		lhs.add(25);
		lhs.add(30);
		lhs.add(35);
		
		System.out.println(lhs);
		System.out.println("Size of the LinkedHashSet is : "+lhs.size());

	}

}
