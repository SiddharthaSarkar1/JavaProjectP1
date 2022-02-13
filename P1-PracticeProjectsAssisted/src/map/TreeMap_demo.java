package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_demo {
	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<>();
		
		tmap.put(1, "Earth");
		tmap.put(2, "Sun");
		tmap.put(3, "Mars");
		tmap.put(4, "Jupiter");
		tmap.put(5, "Venus");
		tmap.put(10, "Moon");
		tmap.put(20, "Saturn");
		tmap.put(15, "Mercury");
		tmap.put(7, "Uranus");
		
		System.out.println(tmap);
		System.out.println("Get value at 3 : "+tmap.get(5));
		tmap.remove(10);
		
		for(Map.Entry<Integer, String> val : tmap.entrySet()) {
			System.out.println("Key : "+val.getKey()+" and Value : "+val.getValue());
		}
	}
}
