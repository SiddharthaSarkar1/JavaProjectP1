package collections_examples;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Demo {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(70);
		ll.add(80);
		ll.add(90);
		ll.add(100);
		
		System.out.println(ll);
		System.out.println("Size of the linkedlist is : "+ll.size());
		
		System.out.println(ll.get(5));
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		Iterator<Integer> itr = ll.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
