package siya;

public class practice01 {
	public static void main(String[]args) {
		@SuppressWarnings("unused")
		int number=5;
		int fact=1;
		
		for(int i=2;i<=5;i++) {
			fact=fact*i;
		}
		
		System.out.println(fact);
	}

}
