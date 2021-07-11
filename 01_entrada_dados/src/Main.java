
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String nome = sc.next();  -> pega apenas a primeira palavra
		/*String nome = sc.nextLine();
		int num1 = sc.nextInt();
		double num2 = sc.nextDouble();
		char charito = sc.next().charAt(0);
		System.out.printf("Você digitou o seguinte nome: %s%n", nome);
		System.out.printf("Você digitou o seguinte número: %d%n", num1);
		System.out.printf("Você digitou o seguinte número: %.2f%n", num2);
		Locale.setDefault(Locale.US);
		System.out.printf("[Formatação US]Você digitou o seguinte número: %.2f%n", num2);
		System.out.println("Você digitou o seguinte caractere: " + charito);*/
		
		int x;
		String a, b, c;
		x = sc.nextInt();  // -> A quebra de linha aqui será consumida pelo comando debaixo.
		sc.nextLine(); // -> Consumirá a quebra de linha do x e não prejudicará o código.
		a = sc.nextLine();
		b = sc.nextLine();
		c = sc.nextLine();
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close();
	
	}

}
