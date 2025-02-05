package nested;

public class NESTED {
	
	public static void main(String[] args ) {
		
		int n1=10;
		int n2=25;
		int n3=96;
		
		if(n1<n2 && n2<n3) {
			System.out.println("Number n1 is smallest...");	
		}
		
		else if(n2<n3 && n3<n1) {
			
			System.out.println("Number n2 is smallest....");
		}
		else {
		System.out.println("Number n3 is smallest");
		
		
		}
	}

}
