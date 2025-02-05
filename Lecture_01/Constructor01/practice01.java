

class practice01 {

    int number1,number2,number3,number4;

  practice01(int Number1,int Number2, int Number3, int Number4) {
     
         number1=Number1;
         number2=Number2;
         number3=Number3;
         number4=Number4;
 }

         public  void display(){
            
            System.out.println("multiplication :"+(number1*number2*number3*number4));
     
   }
   public static void main(String[] args) {
    practice01 pr = new practice01 (10,20,30,40);
    pr.display();
    
   }
}