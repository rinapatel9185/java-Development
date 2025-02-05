public class parameterize01 {
    
    int number1 , number2,number3,number4;

    parameterize01( int Number1 , int Number2,int Number3,int Number4)
    { 
        number1=Number1;
        number2=Number2;
        number3=Number3;
        number4=Number4;
        
    }
    
    public void display() {
    
    System.out.println("Number:"+(number1+number2+number3+number4));
   
            
    }
    
    
    public static void main(String[] args)
    {
        
        parameterize01 con = new parameterize01 (10,20,30,40);
        con.display();
    }
   
}
