public class Main{
	public static void main(String[] args) {
	
	// Object
	
	Account ebra = new Account("Ebra", 1234);
	ebra.deposit(1000);
	ebra.withdraw(200, 1234);

	System.out.println("The current balance is: $" + ebra.balance);
	}
}
