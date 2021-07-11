import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números");
		
		System.out.println("Digite o valor A:");
		var a = sc.nextInt();
		System.out.println("Digite o valor B:");
		var b = sc.nextInt();
		System.out.println("Digite o valor C:");
		var c = sc.nextInt();
		
		var maior = qualEhMaior(a, b, c);
		
		System.out.println(maior);
		sc.close();
	}

	private static int qualEhMaior(int a, int b, int c) {
		if(a > b && a >c) {
			System.out.println("O maior valor digitado é foi: " + a);
			return a;
		} else if(b > a && b > c) {
			System.out.println("O maior valor digitado foi: " + b);
			return b;
		} else {
			System.out.println("O maior valor digitado foi: " + c);
			return c;
		}
	}

}
