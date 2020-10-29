public class BankAccount {
	
	private double balance;
	private int accountID;
	private String password;

	public BankAccount(int accID, String p) {
		accountID = accID;
		password = p;
	}
	public int getAccountID() {
		return accountID;
	}
	public double getBalance() {
		return balance;
	}
	public void setPassword(String newPass) {
		password = newPass;
	}
	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		} 
		balance += amount;
		return true;
	}
	public boolean withdraw(double amount) {
		if (amount > balance || amount < 0) {
			return false;
		}
		balance -= amount;
		return true;
	}
}