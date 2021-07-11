import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
//		Em programa��o, matriz � o nome dado a arranjos bidimensionais.
//		Aten��o: "vetor de vetores".
//		
//		Arranjo(array) � uma estrutura de dados:
//			Homog�nea (dados do mesmo tipo);
//			Ordenada (elementos acessados por meio de posi��es);
//			Alocada de uma vez s�, em um bloco cont�guo de mem�ria;
//			
//		Vantagens:
//			Acesso imediato aos elementos pela sua posi��o.
//			
//		Desvantagens:
//			Tamanho fixo;
//			Dificuldade de realizer inser��es e dele��es.
		
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
