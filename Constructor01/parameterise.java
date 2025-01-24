public class parameterise {
    int number1;
    int number2;
 
	parameterise( int Number1 , int Number2)
 { 
	 number1=Number1;
	 number2=Number2;
	 
 }
 
 public void display() {
 
 System.out.println("number1:"+(number1+number2));

		 
 }
 
 
 public static void main(String[] args)
 {
	 
	parameterise con = new parameterise(25,25);
	 con.display();
 }



    
    
}
