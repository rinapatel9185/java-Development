package Array_List_Example;

import java.util.ArrayList;

public class A_list {

	public static void main(String[] args) {
		
		ArrayList<String> data = new ArrayList<String>();
		
		// add data 
		data.add("Samosa");
		data.add("kachori");
		data.add("fafda");
		data.add("vada");
		
		System.out.println("data : "+data);
		
		System.out.println(data.get(2));
		
		data.remove(3);
		System.out.println(data);
		
		for(String d : data) {
			System.out.println(d);
		}
		
		
		
	}

}
