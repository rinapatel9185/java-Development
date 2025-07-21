package Riya02.cwpc;

public class constructor {
	int number=201 ;
    String website = "TCS";
    constructor(){
    	
    	System.out.println(" java program");
    	System.out.println("Number"+number);
    }
    constructor(String  web)
    {
    	website=web;
    	System.out.println("Website name is :"+web);
    }
    
    void getdata() {
    	System.out.println("Number "+number);
    	System.out.println("Website name is :"+website);
    }

}
