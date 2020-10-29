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
}