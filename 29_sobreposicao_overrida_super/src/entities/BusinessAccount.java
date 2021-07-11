package entities;

public class BusinessAccount extends Account {
	public Double loanLimit;

	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer number, String holder, double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	@Override
	public void withdraw(double ammount) {
		if(ammount > balance) {
			System.out.println("Insufficient funds. Operation failed.");
		}else {
			super.withdraw(ammount);
			balance -= 2.0;
		}
	}
	
	public void loan(double ammount) {
		if(ammount <= loanLimit) {
			balance += ammount;			
		}
	}
	
}
