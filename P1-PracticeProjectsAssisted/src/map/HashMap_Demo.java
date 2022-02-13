package map;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo {

	public static void main(String[] args) {
		HashMap<Integer, String> hsmap = new HashMap<>();
		
		hsmap.put(1, "Earth");
		hsmap.put(2, "Sun");
		hsmap.put(3, "Mars");
		hsmap.put(4, "Jupiter");
		hsmap.put(5, "Venus");
		hsmap.put(10, "Moon");
		hsmap.put(20, "Saturn");
		hsmap.put(15, "Mercury");
		hsmap.put(7, "Uranus");
		hsmap.put(null, null);
		hsmap.put(null, "Extra_Data");
		
		System.out.println(hsmap);
		System.out.println("Get data at 5 : "+hsmap.get(5));
		hsmap.remove(10);
		
		for(Map.Entry<Integer, String> val : hsmap.entrySet()) {
			System.out.println("Key : "+val.getKey()+" and Value : "+val.getValue());
		}

	}

}
