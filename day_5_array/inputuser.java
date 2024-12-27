
import java.util.Scanner;

public class inputuser {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

         int size;

        System.out.println("enter  size array ...");
        size=scanner.nextInt();

        int [] array = new int[size];




        for(int i=0; i< size ;i++ ){

            System.out.println("enter element array... ["+i+"]");

            array[i]=scanner.nextInt(); 

        }

         System.out.println("Array element are :");
        for(int i=0; i< size ;i++ ){

          System.out.println("Array elements are : "+"["+i+"]  = "+array[i]);
        }
        
    }
    
}
