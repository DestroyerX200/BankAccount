public class Tester {
	public static void main(String[] args) {
		// BankAccount k = new BankAccount(215718, "goodpassword123");
		// System.out.println(k.getAccountID());
		// System.out.println(k.getBalance());

		// System.out.println();

		// k.setPassword("betterpassword123");
		// k.deposit(-343);
		// System.out.println(k.deposit(-343));
		// k.deposit(1000);
		// System.out.println(k.deposit(1000));
		// System.out.println(k.getBalance());

		// System.out.println();

		// System.out.println(k.withdraw(-3242));
		// System.out.println(k.withdraw(434343411));
		// System.out.println(k.withdraw(1500));
		// System.out.println(k.getBalance());

		// System.out.println(k.toString());

		BankAccount b1 = new BankAccount(1000001, "abc123");
		BankAccount b2 = new BankAccount(1000231, "abcasdg23");

		System.out.println("Account b1:");
		b1.deposit(3000.0);
		b2.deposit(1234.0);
		System.out.println(b1);
		System.out.println("Account b2:");
		System.out.println(b2);
		System.out.println();

		double cashAmount = 300.0;
		while(cashAmount < 3000){
        	System.out.println("Attempt to move $"+cashAmount+" from the b1 to b2 account:");
        	System.out.println(b1);
            System.out.println(b2);
            System.out.println();
        	if (! b1.transferTo(b2, cashAmount, "abc123")) {
        		System.out.println("Transfer Failed");
        	}  
        	cashAmount *= 2;
		}

	}
}
