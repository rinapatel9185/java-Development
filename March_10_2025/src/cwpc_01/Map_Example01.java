package cwpc_01;

import java.util.HashMap;
import java.util.Map;

public class Map_Example01 {

	public static void main(String[] args) {
		
		Map<Integer,String> data = new HashMap<Integer, String>();
		// add data 
		data.put(101,"JAVA");
		data.put(102,"C++");
		data.put(103,"JSP");
		data.put(104,"Servlet");
		data.put(105,"Spring");
		
		System.out.println("Data : "+data);
		
		// Removing Elements from HashMap
		data.remove(102);
		
		System.out.println("Data "+data);

		// get all keys and values using loop 
		// Iterating Over HashMap
		
		for (Map.Entry<Integer, String> entry : data.entrySet()) {
		    Integer key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println("Key: " + key + ", Value: " + value);
		}
		
		
	}

}
