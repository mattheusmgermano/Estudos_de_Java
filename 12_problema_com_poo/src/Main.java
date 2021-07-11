
public class Main {

	public static void main(String[] args) {
		var tx = new Triangulo(3.0, 4.0, 5.0);
		var ty = new Triangulo(7.50, 4.50, 4.02);
		
		var areax = tx.Area();
		var areay = ty.Area();
		
		if(areax > areay) {
			System.out.println("O maior tri�ngulo � o tri�ngulo X, com �rea de "+ areax);
		}else {
			System.out.println("O maior tri�ngulo � o tri�ngulo Y, com �rea de "+ areay);
		}

	}

}
