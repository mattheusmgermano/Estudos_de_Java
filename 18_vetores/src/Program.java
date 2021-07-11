import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
//		Em programa��o, "vetor" � o nome dado a arranjos unidimensionais.
//		
//		Arranjo(array) � uma estrutura de dados:
//			Homog�nea (dados do mesmo tipo);
//			Ordenada (elementos acessados por meio de posi��es);
//			Alocada de uma vez s�, em um bloco cont�guo de mem�ria.
//		
//		Vantagens:
//			Acesso imediato aos elementos pela sua posi��o.
//			
//		Desvantagens:
//			Tamanho fixo;
//			Dificuldades para realizar inser��es e dele��es.
		
		var sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		
//		var vect = new double[n];
//		
//		var avg = 0.0;
//		
//		for(var i = 0; i < vect.length; i++) {
//			vect[i] = sc.nextDouble();
//			avg += vect[i];
//		}
//		System.out.println("M�dia de alturas: " + avg / vect.length);
		
		var n = sc.nextInt();
		var vect = new Product[n];
		var avg = 0;
		
		for(var i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			avg += vect[i].getPrice();
		}
		System.out.println("Average price: " + avg / vect.length);
		
		
		sc.close();

	}

}
