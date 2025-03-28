package Practice_17;
import java.IO.IOException;
import java.sql.SQLException;
class CustomException extends Exception{
	public CustomException(String Message) {
		super(Message);
	}
}
public class CustomExceptionExample {
	 public static void demonstrateCustomException(int value) throws CustomException {
	        if (value < 0) {
	            throw new CustomException("Negative value provided: " + value);
	        }
	        System.out.println("Value is: " + value);
	    }
	 public static void main(String [] args) {
		 try {
		 demonstrateCustomException(20);
		 demonstrateCustomException(-10);
		 
		 
	 }catch(CustomException e) {
		 System.out.println("Caught CustomException "+e.getMessage());
		 
	 }
	 }
}
