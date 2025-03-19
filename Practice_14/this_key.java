package Practice_11;

public class this_key {
	 
	 String name;
	 int salary ;
	 String address;
	 int pack;
	 
	this_key(String name, int salary,String address,int pack) {
		this.name=name;
		this.salary=salary;
		this.address=address;
		this.pack=pack;
		
	}
	public String getName() {
		return name;

	}
	public void setName(String name) {
		this.name=name;
		
	}
	public int getSalary() {
		return salary;
		
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
		
	}
	public int getPack() {
		return pack;
	}
	public void setPack(int pack) {
		this.pack=pack;
	}
}
