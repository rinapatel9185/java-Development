public class parameterise02 {
    
    int number1,number2,number3,number4;

 parameterise02(int Number1, int Number2,int Number3,int Number4){
    number1=Number1;
    number2=Number2;
    number3=Number3;
    number4=Number4;
}
   void display(){
    System.out.println("Total number:"+(number1+number2+number3+number4));

  }
 public static void main(String[] args) {

    parameterise02 con = new parameterise02(45,68,85,90);
	 con.display();
 }

}