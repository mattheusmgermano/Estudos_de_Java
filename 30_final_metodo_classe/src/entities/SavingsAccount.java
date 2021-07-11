package entities;

public final class SavingsAccount extends Account {
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public void withdraw(double ammount) {
		if(ammount > balance) {
			System.out.println("Insufficient funds. Operation failed.");
		}else {
			balance -= ammount;			
		}
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
}
