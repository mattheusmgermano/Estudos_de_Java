import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
//		Em programação, "vetor" é o nome dado a arranjos unidimensionais.
//		
//		Arranjo(array) é uma estrutura de dados:
//			Homogênea (dados do mesmo tipo);
//			Ordenada (elementos acessados por meio de posições);
//			Alocada de uma vez só, em um bloco contíguo de memória.
//		
//		Vantagens:
//			Acesso imediato aos elementos pela sua posição.
//			
//		Desvantagens:
//			Tamanho fixo;
//			Dificuldades para realizar inserções e deleções.
		
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
//		System.out.println("Média de alturas: " + avg / vect.length);
		
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
