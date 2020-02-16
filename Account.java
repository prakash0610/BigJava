
public class Account implements IBalance {
	
	private double balance;
	
	public Account(double balance)
	{
	
		if(balance < 0){ // verifying the initial balance
	
			System.out.println(" The initial balance is not valid");
	}
		else
		{
	
			this.balance = balance; // set the balance as initial balance
	    }
}
	//method credit
	
	public double credit(double depositAmount) {
		
		if(depositAmount<0)
			
			System.out.println("Entered value is negative. Please enter positive amount");
			
		else
			
			balance= balance+depositAmount;
		
		return balance;
		
	}
	
	//method debit
	
	public double debit(double withdrawAmount) {
	
		if (withdrawAmount<0)
		
			System.out.println("Entered value is negative. Please enter positive amount");	
	
		else if(withdrawAmount>balance)
	
		{
	
			System.out.println(" Debit amount exceeded the account balance");
	
		}
	
		else {
	
			balance = balance - withdrawAmount;
	
	}
	return balance;
	}
	
	 public double getBalance() { return balance; }
	 
}
