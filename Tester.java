public class Tester {
	public static void main(String[] args) {
		BankAccount k = new BankAccount(215718, "goodpassword123");
		System.out.println(k.getAccountID());
		System.out.println(k.getBalance());

		System.out.println();

		k.setPassword("betterpassword123");
		k.deposit(-343);
		System.out.println(k.deposit(-343));
		k.deposit(1000);
		System.out.println(k.deposit(1000));
		System.out.println(k.getBalance());

    }
}
