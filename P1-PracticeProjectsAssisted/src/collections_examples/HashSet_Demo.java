package collections_examples;

import java.util.HashSet;

public class HashSet_Demo {
	
	public static void main(String[] args) {

	HashSet<String> hs = new HashSet<String>();

	hs.add("cat");
	hs.add("dog");
	hs.add("lion");
	hs.add("goat");
	hs.add("elephant");
	hs.add("elephant");
	hs.add(null);
	
	System.out.println(hs);
	
	System.out.println("Is Empty : "+hs.isEmpty());
	System.out.println("Size of the HashSet is : "+hs.size());
	
	}
	
}
