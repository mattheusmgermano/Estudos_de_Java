
public class Product {
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String name;
	public double price;
	public int quantity;
	
	public void TotalValueInStock() {
		var totalValue = price * quantity;
		System.out.printf("Product: %s | Price: $%.2f | Quantity: %d units.%n", name, price, quantity);
		System.out.println("The total value of this product in stock is $" + totalValue);
		System.out.println("");
	}
	
	public int AddProduct(int qtty) {
		quantity += qtty;
		TotalValueInStock();
		return quantity;
	}
	public int RemoveProduct(int qtty) {
		quantity -= qtty;
		TotalValueInStock();
		return quantity;
	}
}
