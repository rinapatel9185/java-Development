package M_21;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example01 {

	public static void main(String[] args) {
		
		
		// create Scanner object
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your name ");
		String name =sc.next();
		
		System.out.println("Enter your age ");
		int age = sc.nextInt(); 
		
		System.out.println("Enter your height ");
		int height = sc.nextInt(); 
		
		System.out.println("Your Name is : "+name);
		System.out.println("Your Age is : "+age);
		System.out.println("Your height is : "+height);
		
		int bmi = age / height;
		System.out.println("Your BMI = "+bmi);
		
		}catch (InputMismatchException e) {
			System.out.println("Please Enter Only Number -");
		}catch(ArithmeticException e) {
			System.out.println("Do not enter zero into height - ");
		}

	}

}
