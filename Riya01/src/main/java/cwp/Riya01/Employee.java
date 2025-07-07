package cwp.Riya01;

public class Employee extends Company {
	int salary;
	String Name,City;
	
	

	public Employee(String company_name, String address, int company_id, int salary, String name, String city) {
		super(company_name, address, company_id);
		this.salary = salary;
		Name = name;
		City = city;
	}

	public int getSalary() {
		return salary;
	}
     
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}
	

}
