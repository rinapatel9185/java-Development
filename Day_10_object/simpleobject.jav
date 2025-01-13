package function01;

public class simpleobject{
	
	String name = "Yash";
	int salary = 15000;

	void display() {
		
		System.out.println("NAMAE : " +name);
		System.out.println("SALARY :" +salary);
		}
	
	public static void main(String [] args) {
		
	simpleobject obj = new simpleobject ();
		obj.display();
			
		
	}
}
