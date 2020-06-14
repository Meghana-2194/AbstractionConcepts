package AbstarctClassConcepts;

public abstract class Bank {
	
	public abstract void loan(); // Abstract method // no body 
	  
	// Non-Abstract 
	public void credit (){
		System.out.println("Credit Loan");
	}
	public void debit (){
		System.out.println("Debit Loan");
	}

}
