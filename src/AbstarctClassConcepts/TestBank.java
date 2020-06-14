package AbstarctClassConcepts;

public class TestBank {

	public static void main(String[] args) {
		
		CanaraBank c = new CanaraBank();
		//Bank b = new Bank(); // abstract class cannot be instantiated 
		c.credit();
		c.debit();
		c.loan();
		c.funds(); // own 

	}

}
