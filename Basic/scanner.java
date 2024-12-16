package nested;
import java.util.Scanner;
public class scanner {
	
	public static void main(String[] args ) {

        Scanner sc=new.Scanner(System.in)		
		
		int age;
		string name, address;
		float height;
		char ltr;
		System.out.println("enter your address :");
		address=sc.nextLine();
		System.out.println("enter your name :");
		name=sc.next();
		System.out.println("enter your age :");
		age=sc.nextInt();
		System.out.println("enter your height :");
		height=sc.nextFloat();
		System.out.println("enter your char :");
		ltr=sc.next().charAt(0);
		System.out.println("enter your address :" +address);
		System.out.println("enter your name :" +name);
		System.out.println("enter your age :" +age);
		System.out.println("enter your char :" +ltr);
		System.out.println("enter your height :" +height);
		
		
	}

}
