public class obbjectclass {
    String name;
	int rollno;
	
	void display() {
		
		System.out.println("Name ="+name);
		System.out.println("Rollno="+rollno);
		
	}
	public static void main(String[]args) {
		
		obbjectclass obj =new obbjectclass();
		obj.name="Yash";
		obj.rollno=101;
		obj.display();
	}
    
}
