package mat_func;

public class Main {

	public static void main(String[] args) {
		//A = Mat.sqrt(x);  -> raiz quadrada de x
		//A = Mat.pow(x, y);  -> x elevado a y
		//A = Mat.abs(x);  -> valor absoluto de x
		
		double a = 3.0;
		double b = 4.0;
		double c = -5.0;
		double X,Y,Z;
		
		X = Math.sqrt(a);
		Y = Math.sqrt(b);
		Z = Math.sqrt(25.0);
		
		System.out.printf("O raiz quadrada de %.2f é: %.2f%n", a, X);
		System.out.printf("O raiz quadrada de %.2f é: %.2f%n", b, Y);
		System.out.printf("O raiz quadrada de 25 é: %.2f%n", Z);
		
		X = Math.pow(a, b);
		Y = Math.pow(b, 2.0);
		Z = Math.pow(c, 4.0);
		
		System.out.printf("%.2f elevado a %.2fª potência é igual a: %.2f%n", a, b, X);
		System.out.printf("%.2f elevado à 2ª potência é igual a: %.2f%n", b, Y);
		System.out.printf("%.2f elevado à 4ª potência é igual a: %.2f%n", c, Z);
		
		X = Math.abs(b);
		Y = Math.abs(c);
		
		System.out.println(X);
		System.out.println(Y);
		
	}

}
