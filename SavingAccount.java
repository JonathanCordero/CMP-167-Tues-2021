/*
 * 1- Extends from Account (check)
 * 2- have unique attributes(check?)
 * 3- Override the parents methods in the child class (check)
 */
public class SavingAccount extends Account{
	private double interest = 0.6;
	private int wCounter = 1;
	private int limit = 0;
	
	public static void main(String[] args) {
		SavingAccount acct = new SavingAccount();
		System.out.println(acct);
		acct.deposit(400.99);
		System.out.println(acct);
		acct.withdraw(2000);
		acct.withdraw(250.00);
		acct.withdraw(10.00);
		acct.withdraw(10.00);
		acct.withdraw(10.00);
		System.out.println(acct);
	}
		
	public void withdraw(double amount) {
		if(limit == 4) {
			System.out.println("Your monthly withdraw limit has been reached. Please contact customer support.");
		}
		else if (wCounter < 4){
			super.withdraw(amount);
			++wCounter;
			++limit;
		}
		else {
			double interestToCharge = amount*interest; // error float and double causes a wrong calculation because of the way its represented in the binary memory. Consider using Bigdecimal.
			System.out.println("Interest :" + interestToCharge);
			amount = amount + interestToCharge;
			super.withdraw(amount);
			wCounter = 1;
			++limit;
		}
	}
	@Override
	public String toString() {
		return "Type: Saving, " + super.toString() + ", Interest %" + (interest*10);
	}
}
	