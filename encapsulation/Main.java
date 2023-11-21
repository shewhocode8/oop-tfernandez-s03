public class Main{
	public static void main(String[] args){
		BankAccount user = new BankAccount("123AB", "Juan Dela Cruz", 5000);
		user.setBalance(12000);
		double balance = user.getBalance();

		String id = user.getAccountNumber();
		String name = user.getAccountHolderName();

		System.out.println(id);
		System.out.println(name);
		System.out.println(balance);
		
	}
}