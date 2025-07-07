package cwp.Riya01;

import java.util.HashMap;

public class App {
	
	public static void main(String [] args) {
		
	    Employee emp=new Employee("Bayasunrise","Mumbai_4000651", 101,90000, "RIYA","Mumbai");
		System.out.println("Employee Name:"+emp.getName());
		System.out.println("Employee City :"+emp.getCity());
		System.out.println("Employee Company_name :"+emp.getCompany_name());
		System.out.println("Employee Company_id :"+emp.getCompany_id());
		System.out.println("Employee address :"+emp.getAddress());
		System.out.println("Employee Salary:"+emp.getSalary());
		
		
		emp.setSalary(45000);
		System.out.println("Employes Name:"+emp.getName());
		System.out.println("Employee City :"+emp.getCity());
		System.out.println("Employee Salary :"+emp.getSalary());
	      
		int limit[]= {120000,560000,980000,870000};
		String name [] = {"hdfc","icici","sbi","kotak"};
		 
		CreditCard cc = new CreditCard(limit,name);
		cc.display(); 
		
		
		HashMap<Integer, String>mydata =new HashMap<Integer, String>();
		mydata.put(101, "java");
		mydata.put(102, "sql");
		mydata.put(103, "ruby");
		
		Books book = new Books(mydata);
		book.display_books();
	}
	

}
