package Riya02.cwpc;

public class App 
{
    public static void main( String[] args )
    {
    //	constructor con=new constructor();
    //    con.getdata();
    	Encapsulation en=new Encapsulation("rina","mumbai", 15830,25);
    	System.out.println("employee name "+en.get_name());
    	System.out.println("employee city "+en.get_city());
    	System.out.println("employee rollno "+en.get_rollno());
    	System.out.println("employee age "+en.get_age());
    	
    }
}
