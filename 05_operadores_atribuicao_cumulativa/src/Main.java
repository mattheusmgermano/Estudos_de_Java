import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Uma operadora de telefonia cobra R$ 50,00 por um plano básico		| 
		//que dá direito a 100 minutos de telefone. Cada minuto que exceder	|
		//a franquia de 100 minutos custa R$ 2,00.							|
		//Cliente A: 22min/R$50   Cliente B: 103min/R$56					|
		
		Scanner sc = new Scanner(System.in);
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta R$ %.2f%n", conta);
		
		sc.close();

	}

}
