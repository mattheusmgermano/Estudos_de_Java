import java.util.Locale;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var product1 = "Computer";
		var product2 = "Mouse";
		var product3 = "Keyboard";
		
		var age = 30;
		var code = 5290;
		var gender = 'F';
		
		var price1 = 4999.33466;
		var price2 = 323.45;
		var price3 = 399.85;
		
		System.out.println("Products:");
		Locale.setDefault(Locale.US);
		System.out.printf("%s: $%.2f%n", product1, price1);
		System.out.printf("%s: $%.2f%n", product2, price2);
		System.out.printf("%s: $%.2f%n", product3, price3);
		System.out.printf("Records: %d yo, code %d and gender %c", age, code, gender);
		
		
		
	}

}
