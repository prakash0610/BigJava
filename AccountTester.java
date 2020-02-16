
import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) {
		
		// Set up scanner and define variable
		
		Scanner in = new Scanner(System.in);
		
		double interestAmount ;
		
		
		//Print statement to set up input prompt
				
		SavingsAccount savingsAccount = new SavingsAccount(1000 ,1 );
				
		interestAmount = savingsAccount.CalculateInterest();
				
		System.out.println("The amount of interest to be added "+interestAmount);
				
		System.out.println("Balance before interest calculation "+savingsAccount.getBalance());
				
		savingsAccount.credit(interestAmount);
				
		System.out.println("Balance after interest calculation "+savingsAccount.getBalance());
				
				
		//Case-Withdraw
		
		
		System.out.print("Savings Account: Please enter the Withdraw Amount: ");
		
		double Withdraw_Amount1 = in.nextDouble();
	   	
		savingsAccount.debit(Withdraw_Amount1);
	
		System.out.println();
		
		System.out.println("Balance in savingsAccount is: " + savingsAccount.getBalance());
	
	
		//Case-Deposit
				
		System.out.print("Savings Account: Please enter the Deposit Amount: ");
		
		double Deposit_Amount1 = in.nextDouble();
		
		savingsAccount.credit(Deposit_Amount1);
		
		System.out.println();
				
		System.out.println("Balance in savingsAccount is: " + savingsAccount.getBalance());
				
		
	
		CheckingAccount checkingAccount = new CheckingAccount(2000.0, 0.5);
	
		//Case-Withdraw
	
		System.out.print("Checking Account:Please enter the Withdraw Amount: ");
	
		double Withdraw_Amount2 = in.nextDouble();
	
		checkingAccount.debit(Withdraw_Amount2);
	
		System.out.println();
	
		System.out.println("Checking Account: Balance in checkingAccount is: " + checkingAccount.getBalance());
	
	
		//Case-Deposit
	
		System.out.print("Please enter the Deposit Amount: ");
	
		double Deposit_Amount2 = in.nextDouble();
	
		checkingAccount.credit(Deposit_Amount2);
	
		System.out.println();
	
		System.out.println("Balance in checkingAccount is: " + checkingAccount.getBalance());
		
		in.close();	
}
	
}
