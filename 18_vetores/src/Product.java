
public class Product {
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	private String name;
	private double price;

	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
}
