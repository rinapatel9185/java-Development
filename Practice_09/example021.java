package Practice_09;
 
import java.util.HashSet;
import java.util.Set;

public class example021 {
	
	public static void main(String [] args) {
		
		Set<String> data = new HashSet<>();
		
		data.add("Momos");
		data.add("Samosh");
		data.add("Kachori");
		
		System.out.println(data);
		
		data.remove("Kachori");
		System.out.println(data);
		
		data.clear();
		System.out.println(data);
		
		System.out.println("data.contains(Momos)");
		
		System.out.print(data.size());
		
		data.clear();
		System.out.println(data.isEmpty());
		
		
		data.add("Samosa");
		data.add("Pavbhaji");
		data.add("Momos");
		data.add("Kachori");
		
		System.out.println(data);
	}
	
	

}
