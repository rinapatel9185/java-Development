package Practice_11;

import java.util.HashMap;
import java.util.Map;

public class Map_example {
	
	public static void main(String []args) {
		
		Map<Integer, String> data= new HashMap<Integer, String>();
		
		data.put(101, "HINDI");
		data.put(102, "ENGLISH");
		data.put(103, "MATH");
		data.put(104, "SCIENCE");
		data.put(105, "MARATHI");
		
		System.out.println("DATA :"+data);
		
		data.remove(103);
		System.out.println("DATA :"+data);
		
		for (Map.Entry<Integer, String> entry : data.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key:"+key+",value:"+value);
			 
			// boolean containsKey = data.containsKey("HINDI");
			// System.out.println("contains HINDI :"+containsKey); 
		}
	}

}
