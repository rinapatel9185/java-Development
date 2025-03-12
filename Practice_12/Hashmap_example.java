package Practice_11;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_example {
	
	public static void main(String[] args) {
		Map<Integer, String> data = new HashMap<Integer, String>();
		
		data.put(101, "SIYA");
		data.put(102, "RINA");
		data.put(103, "RAM");
		data.put(104, "KANHA");
		data.put(105, "MANU");
		
		System.out.println("DATA : "+data);
		
		data.remove(102);
		System.out.println("DATA : "+data);
		
		
		for(Map.Entry<Integer, String> entry:data.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key : "+key+",value "+ value);
			
		
		}
		
	}

}
