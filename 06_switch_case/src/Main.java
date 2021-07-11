import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var diaSemana = sc.nextInt();
		switch(diaSemana) {
		case 1:
			System.out.println("Hoje é domingo.");
			break;
		case 2:
			System.out.println("Hoje é segunda-feira.");
			break;
		case 3:
			System.out.println("Hoje é terça-feira.");
			break;
		case 4:
			System.out.println("Hoje é quarta-feira.");
			break;
		case 5:
			System.out.println("Hoje é quinta-feira.");
			break;
		case 6:
			System.out.println("Hoje é sexta-feira.");
			break;
		case 7:
			System.out.println("Hoje é sábado.");
			break;
		default:
			System.out.println("Valor inválido.");
			break;
		}
		sc.close();
	}

}
