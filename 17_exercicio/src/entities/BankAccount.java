package entities;

public class BankAccount {

	private String titular;
	private int accountNum;
	private double balance;

	public BankAccount(String titular, int accountNum) {
		super();
		this.titular = titular;
		this.accountNum = accountNum;
		balance = 50.00;
	}
	
	public BankAccount(String titular, int accountNum, double balance) {
		super();
		this.titular = titular;
		this.accountNum = accountNum;
		this.balance = balance;
	}
	public String getTitular() {
		return titular;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public double getBalance() {
		return balance;
	}
	public double Withdraw(double value) {
		if(value > balance) {
			System.out.println("You can't withdraw this ammount. Insufficient funds!");
			return balance;
		}else {
			this.balance -= value;
			System.out.println("Success! U$" + value + " withdrawned.");
			System.out.println(toString());
			return balance;
		}
	}
	public double Deposit(double value) {
		if(value < 0) {
			System.out.println("You can deposit a negative ammount of money you dumbass.");
			return balance;
		}else {
			this.balance += value;
			System.out.println("Success! U$" + value + " Deposited.");
			System.out.println(toString());
			return balance;
		}
	}
	@Override
	public String toString() {
		return "BankAccount [Account Holder: " + titular + "] [Number: " + accountNum + "] [Balance: U$" + balance + "]";
	}
}
