package Practice_17;
import java.util.InputMismatchException;
import  java.util.Scanner;
public class Class_2025 {
	public static void main(String [] args) {
		try {
			Scanner sc= new Scanner(System.in);
			int age;
			int height;
			
			System.out.println("ENTER YOU AGE:");
			age =sc.nextInt();
			System.out.println("ENTER YOUR HEIGHT:");
			height= sc.nextInt();
			
			System.out.println("age:"+age);
			System.out.println("height :"+height);
		}catch(InputMismatchException e) {
			System.out.println("ENTER ONLY NUMBER");
			
		}
		
	}

}
