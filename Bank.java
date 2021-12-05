//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

//work on bank office and Bank class to implement the savingAccount class that you previously created
public class Bank {
//public int code;
	public String address;
	private String name;
	//private ArrayList<CheckingAccount> checkingAccountList = new ArrayList<CheckingAccount>();//how to create
	private HashMap<String, CheckingAccount> CheckingAccountsWithOwner = new HashMap<String, CheckingAccount>();
	private HashMap<String, SavingAccount> SavingAccountsWithOwner = new HashMap<String, SavingAccount>();
	
	
	public Bank(String name, String address) {
		this.address = address;
		this.name = name;
		System.out.println("Bank has been created");
	}
	
	public void openCheckingAcct(String owner) {
		CheckingAccount acct = new CheckingAccount();
		CheckingAccountsWithOwner.put(owner, acct);
		//checkingAccountList.add(acct);// how to add to arraylist
		System.out.println("Account #"+ acct.number + " has been created");
	}
	
	public void openSavingAcct(String owner) {
		SavingAccount acct = new SavingAccount();
		SavingAccountsWithOwner.put(owner, acct);
		//checkingAccountList.add(acct);// how to add to arraylist
		System.out.println("Account #"+acct.number + " has been created");
	}
	
	public void displayAllAccts() {
		/*for ( CheckingAccount elem : checkingAccountList) {//how to loop through
			System.out.println(elem);
			}*/
		for (Entry<String, CheckingAccount> entry : CheckingAccountsWithOwner.entrySet()) {
			System.out.println("Owner : " + entry.getKey() + " Checking Account " + entry.getValue().toString());
		}
		for (Entry<String, SavingAccount> entry : SavingAccountsWithOwner.entrySet()) {
			System.out.println("Owner : " + entry.getKey() + " Saving Account " + entry.getValue().toString());
		}
		
	}
	
	public void findCheckingAccountInfo(String owner) {
		if (CheckingAccountsWithOwner.containsKey(owner)) {
			System.out.println(CheckingAccountsWithOwner.get(owner));
		}
		else {
			System.out.println("Account info not found");
		}
	}
	
	public void findSavingAccountInfo(String owner) {
		if (SavingAccountsWithOwner.containsKey(owner)) {
			System.out.println(SavingAccountsWithOwner.get(owner));
		}
		else {
			System.out.println("Account info not found");
		}
	}
	
	public void depositMoneytoChecking(String owner, double amount) {
		if(CheckingAccountsWithOwner.containsKey(owner)) {
			CheckingAccountsWithOwner.get(owner).deposit(amount);
		}
		else {
			System.out.println("User not found");
		}
	}
	
	public void depositMoneytoSaving(String owner, double amount) {
		if(SavingAccountsWithOwner.containsKey(owner)) {
			SavingAccountsWithOwner.get(owner).deposit(amount);
		}
		else {
			System.out.println("User not found");
		}
	}
	@Override
	public String toString() {
		return "Bank " + name + " address: " + address + " number of clients" + CheckingAccountsWithOwner.size();//checkingAccountList.size();
	}
}

