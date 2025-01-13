package Total;

public class objectclass03 {
	
	int Total;
	int hindi,math,english,ssc,science;
	

	
	void display() {
		
		System.out.println("HINDI :"+hindi);
		System.out.println("ENGLISH :"+english);
		System.out.println("MATH:"+math);
		System.out.println("SSC:"+ssc);
		System.out.println("SCIENCE :"+science);
		
		int total=(hindi+math+english+ssc+science);
		System.out.println("Total:"+total);
		Total=total;
		
		int per;
		per=(Total*100)/500;
		System.out.println("Percentage:"+per);
		
		
	}
	

	
	public static void  main(String[]args) {
		objectclass03 obj= new objectclass03();
		obj.hindi=85;
		obj.english=98;
		obj.math=96;
		obj.ssc=78;
		obj.science=85;
		obj.display();
		
	}
	
	
	

}
