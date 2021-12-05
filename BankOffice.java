import java.util.Scanner;

public class BankOffice {
	public static void main(String[] args) {
		Scanner Argus = new Scanner(System.in);
		System.out.println("welcome");
		
		System.out.println("Enter a name for the bank");
		String bankName = Argus.nextLine();
		
		System.out.println("Enter the bank's address");
		String bankAddress = Argus.nextLine();
		
		Bank bank = new Bank(bankName, bankAddress);
		String answer;
		
		while(true) {
			System.out.println("Do you want to open a checking account?");
			answer = Argus.nextLine().toLowerCase();
			if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
				System.out.println("Enter a name for the owner");
				answer = Argus.nextLine();
				bank.openCheckingAcct(answer);
			}
			else if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		
		while(true) {
			System.out.println("Do you want to open a Saving account?");
			answer = Argus.nextLine().toLowerCase();
			if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
				System.out.println("Enter a name for the owner");
				answer = Argus.nextLine();
				bank.openSavingAcct(answer);
			}
			else if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		
		while(true) {
			System.out.println("Would you like to deposit to your checking account?");
			answer = Argus.nextLine().toLowerCase();
			if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
				System.out.println("Enter the owner's name");
				answer = Argus.nextLine();
				System.out.println("Enter amount");
				double amount = Argus.nextDouble();
				bank.depositMoneytoChecking(answer, amount);
			}
			
			else if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
			
		}
		
		while(true) {
			System.out.println("Would you like to deposit to your savings account?");
			answer = Argus.nextLine().toLowerCase();
			if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
				System.out.println("Enter the owner's name");
				answer = Argus.nextLine();
				System.out.println("Enter amount");
				double amount = Argus.nextDouble();
				bank.depositMoneytoSaving(answer, amount);
			}
			
			else if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
			
		}
		
		while(true) {
			System.out.println("Would you like to find the checking account info?");
			answer = Argus.nextLine().toLowerCase();
			if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
				System.out.println("Enter the owner's name");
				answer = Argus.nextLine();
				bank.findCheckingAccountInfo(answer);
			}
			else if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		
		while(true) {
			System.out.println("Would you like to find the Saving account info?");
			answer = Argus.nextLine().toLowerCase();
			if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
				System.out.println("Enter the owner's name");
				answer = Argus.nextLine();
				bank.findSavingAccountInfo(answer);
			}
			else if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		
		while(true) {
			System.out.println("Do you want to display all account?");
			answer = Argus.nextLine().toLowerCase();
			if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
				bank.displayAllAccts();
			}
			else if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		System.out.println("_____________________________________________________________________");
		
	System.out.println(bank);
	Argus.close();
	}
}
