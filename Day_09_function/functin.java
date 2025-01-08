package college;

public class functin {
    static int Total;
    static int per;

    static void marks(int hindi,int english,int math, int ssc,int science){
        int total;

        total= hindi+english+math+ssc+science;

        Total=total;

        System.out.println("hindi ="+hindi);
        System.out.println("english ="+english);
        System.out.println("math ="+math);
        System.out.println("ssc ="+ssc);
        System.out.println("science ="+science);
        System.out.println("Total ="+total);

        

    }
   static void Percentage(){
     int percentage=(Total*100)/500;
     System.out.println("Percentage :" +percentage);
      
     per=percentage;



   }
    static void grade(){
    if (per<100 && per>80){
    System.out.print("Grade A");

   }
   else if (per<80 && per>60){
    System.out.println("Grade B");
   }
   else if (per<60 && per>40 ){
    System.out.println("Grade C");
   }
   else if(per<40 && per>35){
    System.out.println("Grade D");

   }
   else {
    System.out.println("Fail");
   }

    
   }
   
  
   public static void main(String[]args){

    marks(50, 95, 65, 85, 80);


    Percentage();
    grade();
   
   }

}


