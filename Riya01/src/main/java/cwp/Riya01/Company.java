package cwp.Riya01;

public class Company {
   
	String company_name,address;
	int company_id;


public Company (String company_name,String address,int company_id) {
	this.company_name=company_name;
	this.address=address;
	this.company_id=company_id;
}


public String getCompany_name() {
	return company_name;
}


public void setCompany_name(String company_name) {
	this.company_name = company_name;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public int getCompany_id() {
	return company_id;
}


public void setCompany_id(int company_id) {
	this.company_id = company_id;
}
}