import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var diaSemana = sc.nextInt();
		switch(diaSemana) {
		case 1:
			System.out.println("Hoje � domingo.");
			break;
		case 2:
			System.out.println("Hoje � segunda-feira.");
			break;
		case 3:
			System.out.println("Hoje � ter�a-feira.");
			break;
		case 4:
			System.out.println("Hoje � quarta-feira.");
			break;
		case 5:
			System.out.println("Hoje � quinta-feira.");
			break;
		case 6:
			System.out.println("Hoje � sexta-feira.");
			break;
		case 7:
			System.out.println("Hoje � s�bado.");
			break;
		default:
			System.out.println("Valor inv�lido.");
			break;
		}
		sc.close();
	}

}
