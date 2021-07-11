import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		var product1 = new Product(sc.nextLine(), sc.nextDouble(), sc.nextInt());
		System.out.println(product1.ToString());
		product1.TotalValueInStock();
		sc.close();
	}

}
