package Practice08;

import java.util.ArrayList;

public class array_list_01 {
	
	public static void main(String[]args) {
		
	ArrayList<Integer> data =new ArrayList<Integer>();
	data.add(28);
	data.add(96);
	data.add(85);
	
	System.out.println("data:"+data);
	
	System.out.println(data.get(2));
	
	data.remove(2);
	System.out.println("data:"+data);
	
	for(int d:data) {
		System.out.println(d);
		
	}
	
	}
}
