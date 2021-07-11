package entities;

public class OutsourceEmployee extends Employee{

	private Double additionalCharge;
	
	public OutsourceEmployee() {
		
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return getHours() * getValuePerHour() + (additionalCharge * 1.10);
	}
	
}
