
public class SavingsAccount extends Account {

	private double interestRate;

	private double interestAmount;

	public SavingsAccount(double balance , double interestRate) 
	{

		super(balance);

		this.interestRate = interestRate;
    }

	public double CalculateInterest()
	{

		double balance = super.getBalance() ;

		interestAmount = (balance * interestRate)/100;

		return interestAmount;
    }
}

