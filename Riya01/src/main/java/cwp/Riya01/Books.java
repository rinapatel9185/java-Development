package cwp.Riya01;

import java.util.HashMap;

public class Books {
	
	HashMap<Integer, String> data= new HashMap<Integer, String>();
	public Books(HashMap<Integer, String>data) {
      this.data=data;		
	}
	void display_books() {
		
		for(HashMap.Entry<Integer, String> entry:data.entrySet()) {
			System.out.println("ID:"+entry.getKey()+",Book Name :"+entry.getValue());
			
		}
			
		
	}

	
	
	
}
