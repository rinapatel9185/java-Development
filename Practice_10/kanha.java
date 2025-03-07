package Practice_10;

import java.util.HashSet;
import java.util.Set;

public class kanha {
	
	public static void main(String[]args) {
		
		Set<Integer> data= new HashSet<>();
		
		data.add(120);
		data.add(254);
		data.add(698);
		data.add(487);
		data.add(487);
		data.add(682);
		
		System.out.println(data);
		
		data.remove(254);
		System.out.println(data);
		
		
		System.out.println(data.contains(658));
		
		System.out.println(data.size());
		
		data.clear();
		System.out.println(data);
		
		System.out.println(data.isEmpty());
		
		
		data.add(123);
		data.add(654);
		data.add(987);
		data.add(256);
		data.add(457);
		data.add(457);
		data.add(457);
		
		
		System.out.println(data);
	}
	
	

}



