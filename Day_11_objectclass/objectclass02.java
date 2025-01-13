public class objectclass02 {
    
	String name;
	int salary;
	
	void display() {
		
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
	}
	
	public static void main(String[]args) {
		objectclass02 obj=new objectclass02();
		obj.name="Riya";
		obj.salary=10000;
		obj.display();
		
		
	}

}

    

