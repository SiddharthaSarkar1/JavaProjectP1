package map;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_Demo {
	
	public static void main(String[] args) {
		
	Hashtable<Integer, String> hst = new Hashtable<>();
	
	hst.put(1, "Earth");
	hst.put(2, "Sun");
	hst.put(3, "Mars");
	hst.put(4, "Jupiter");
	hst.put(5, "Venus");
	hst.put(10, "Moon");
	hst.put(20, "Saturn");
	hst.put(15, "Mercury");
	hst.put(7, "Uranus");
	
	System.out.println(hst);
	System.out.println("Get value at 3 : "+hst.get(5));
	hst.remove(10);
	
	for(Map.Entry<Integer, String> val : hst.entrySet()) {
		System.out.println("Key : "+val.getKey()+" and Value : "+val.getValue());
	}
	}

}
