/*
	encapasulation
		- oop technique to hide data from direct access
		- it allows us to add extra layer of security for the attributes
			-- we need to declare attribute as private

		syntax:
		modifiers className class{
			private attributes
		}
*/

public class BankAccount{
	private String accountNumber;
	private String accountHolderName;
	private double balance;

	public BankAccount(String accountNumber, String accountHolderName, double balanace){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public double getBalance(){
		return balance;
	}

	public String getAccountNumber(){
		return accountNumber;
	}

	public String getAccountHolderName(){
		return accountHolderName;
	}
}