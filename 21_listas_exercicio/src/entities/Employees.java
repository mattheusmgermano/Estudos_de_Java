package entities;

public class Employees {
	

	public int id;
	private String name;
	private double wage;

	public Employees(int id, String name, double wage) {
		super();
		this.id = id;
		this.name = name;
		this.wage = wage;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWage() {
		return wage;
	}
	
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[Employee ID: " + id + "]\nName: " + name + "\nSalary: " + wage + "\n";
	}
	
}
