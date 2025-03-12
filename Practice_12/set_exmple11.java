package Practice_11;

import java.util.HashSet;
import java.util.Set;

public class set_exmple11 {
	
	public static void main(String []args) {
		
		Set<String> data = new HashSet<>();
		
		data.add("samosa");
		data.add("kachori");
		data.add("Pavbhaji");
		data.add("momos");
		
		
		System.out.println(data);
		
		
		data.remove("momos");
		System.out.println(data);
		
		data.clear();
		System.out.println(data);
		
		System.out.println(data.isEmpty());
		
		data.add("gulabjamun");
		data.add("rasmalai");
		data.add("jalebi");
		
		System.out.println(data);
		
	}
	

}
