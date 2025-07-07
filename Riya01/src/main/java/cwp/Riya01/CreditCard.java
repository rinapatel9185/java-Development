package cwp.Riya01;

public class CreditCard {
	
	int Cardlimit[];
	String CardName[];
	
	public CreditCard(int[] cardlimit, String[] cardName) {
		super();
		Cardlimit = cardlimit;
		CardName = cardName;
	}
	
	void display() {
	for (int i = 0; i < CardName.length; i++) {
		System.out.println((i+1)+ "."+CardName[i]+"="+Cardlimit[i]);
		
	}
	}
   
}
