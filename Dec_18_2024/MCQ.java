package mcq_18_2024;
import java.util.Scanner;
public class MCQ {

    public static void main(String[] agr){

        int a=90;
        int b=80;
        // object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Which of the three banks will be merged with the other two to create India’s third-largest bank?\r\n" + //
                        "a) National bank\r\n" + //
                        "b) indian bank\r\n" + //
                        "c) Punjab bank\r\n" + //
                        "d) Kotak bank\n");
        char option = sc.next().charAt(0);
        
        switch (option) {
            case 'a': System.out.println("Wrong Answer");
            break;
            case 'b': System.out.println("Answer: b \r\n" + //
                                "Explanation: Indian Bank is a bank located in India. It was merged with 3 different banks in order to focus on its core business.");
            break;
            case 'c': System.out.println("Wrong Answer");
            break;
            case 'd': System.out.println("Wrong Answer");
            break;
            default :
            System.out.println("select only a,b,c,d");
            
        }
        

        int c = a + b;
        System.out.println(c);
        

    }

