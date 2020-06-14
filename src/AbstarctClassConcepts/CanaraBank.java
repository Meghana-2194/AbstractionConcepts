package AbstarctClassConcepts;

public class CanaraBank extends Bank {
	
	public void loan(){   // overridden from abstract class , can modify accordingly
		System.out.println("My loan is 500000....") ;
	}
    
	public  void funds() { // own method
		System.out.println("My funds is 500000....") ;
	}
}
