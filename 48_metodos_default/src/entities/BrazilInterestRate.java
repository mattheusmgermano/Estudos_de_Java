package entities;

import interfaces.InterestRate;

public class BrazilInterestRate implements InterestRate{
	private double interestRate;

	public BrazilInterestRate(double interestRate) {
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
