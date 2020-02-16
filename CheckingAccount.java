
public class CheckingAccount extends Account{

	private double transactionCharge;

	public CheckingAccount(double balance , double transactionCharge)
	{

		super(balance);

		this.transactionCharge = transactionCharge;
    }

	public double credit(double depositAmount)
	{

		depositAmount = depositAmount - transactionCharge;

		return super.credit(depositAmount);
    }


	public double debit(double withdrawAmount)
	{

		withdrawAmount = withdrawAmount - transactionCharge;

		return super.debit(withdrawAmount);
    }


}
