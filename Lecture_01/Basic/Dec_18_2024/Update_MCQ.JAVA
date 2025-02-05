package mcq;

import java util.Scanner;

public MCQ_SWITCH_CASE{

    public static void main(String [] args){

   Scanner sc= new Scanner(System.in);
   
   System.out.println(1.	Padma Vibhushan is the _____civilian award of India ?\r\n" + //
   a ") highest \r\n" + //
   
   b") fourth highest \r\n" + //
   
   c")third highest \r\n" + //
   
   d")second highest \r\n" + //);

char option =sc.next().charAt(0);

    }
 switch (option) {
            case 'a': System.out.println("Wrong Answer");
            break;

            case 'b': System.out.println("Wrong Answer");
            break;

            case 'c' System.out.println("Wrong Answer");
            break;

            case 'd' System.out.println("Answer : d \r\n" + //The Padma Vibhushan is the second-highest civilian award of the Republic of India,");
    }


}