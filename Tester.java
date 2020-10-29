public class Tester {
	public static void main(String[] args) {
		BankAccount k = new BankAccount(215718, "goodpassword123");
		System.out.println(k.getAccountID());
		System.out.println(k.getBalance());
    }
}
