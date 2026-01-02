public class Account{
String owner;
double balance;
int pin;

	public Account(String ownerInput, int pinInput){
	owner = ownerInput;
	balance = 0.0;
	pin = pinInput;
}

	public void deposit(double amount) {
	balance += amount;
	System.out.println(owner + " deposited $" + amount + ". New Balance: $" + balance);
	}

	public void withdraw(double amount, int pinInput){
	if (pinInput == pin){
	balance -= amount;
	System.out.println("Success!");
	} else {
	System.out.println("Wrong PIN!");
		}
	}
}
