package entities;

import interfaces.InterestRate;

public class USAInterestRate implements InterestRate{
	private double interestRate;

	public USAInterestRate(double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
