import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
//		Em programação, matriz é o nome dado a arranjos bidimensionais.
//		Atenção: "vetor de vetores".
//		
//		Arranjo(array) é uma estrutura de dados:
//			Homogênea (dados do mesmo tipo);
//			Ordenada (elementos acessados por meio de posições);
//			Alocada de uma vez só, em um bloco contíguo de memória;
//			
//		Vantagens:
//			Acesso imediato aos elementos pela sua posição.
//			
//		Desvantagens:
//			Tamanho fixo;
//			Dificuldade de realizer inserções e deleções.
		
		var sc = new Scanner(System.in);
		
		var n = sc.nextInt();
		
		var mat = new int[n][n];
		var count = 0;
		
		for(var i = 0; i < n; i++ ) {
			for(var j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
				if(mat[i][j] < 0) {
					count += 1;
				}
			}
		}
		
		System.out.println("Negative count: " + count );
		System.out.println("");
		
		for(var i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		sc.close();

	}

}
