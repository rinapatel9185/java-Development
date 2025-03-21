package Practice_15;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling {
	public static void main(String[]args) {
		
	    try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String  name =sc.next();
		
		System.out.print("Enter your age");
		int age = sc.nextInt();
		
		System.out.println("Your Name is : "+name);
 		System.out.println("Your Age is : "+age);
	    }catch (InputMismatchException e) {
	    	System.out.println("Please enter only number");
	    }
	 
	}

}
