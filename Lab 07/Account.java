public class Account {
	
	private double balance = 0.0;
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		
		System.out.printf("new balance=%.1f$\n", balance);
	}
	
	public void withdraw(double amount) {
		if (amount > balance) throw new NotEnoughMoneyException(amount, balance);
		balance -= amount;
		System.out.printf("new balance=%.1f$\n", balance);
	}
	
}
