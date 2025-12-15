package siya;

public class practice03 {

	String name;
	int salary;
	
	void display() {
		
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
	}
	
	public static void main(String[]args) {
		practice03 fc =new practice03();
		fc.name="Hery";
		fc.salary=60000;
		fc.display();
		
		
	}

}
