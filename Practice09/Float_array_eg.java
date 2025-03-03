package Practice09;

import java.util.ArrayList;

public class Float_array_eg {
	public static void main(String[]args) {
		ArrayList<Float> data = new  ArrayList<Float>();
		
		data.add(15.2f);
		data.add(58.8f);
		data.add(36.4f);
		data.add(21.2f);
		data.add(98.3f);
		
		System.out.println("data:"+data);
		
		data.remove(2);
		System.out.println("data:"+data);
		
		for(Float d:data) {
			System.out.println(d);
			
		}
		
	}

}
