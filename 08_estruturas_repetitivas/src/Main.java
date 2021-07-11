import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//While � uma estrutura de controle que repete um	
		//bloco de comandos enquanto uma condi��o for		
		//verdadeira.
		//Usar apenas quando n�o se souber previamente a	
		//quantidade de repeti��es que ser� realizada.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[LA�O WHILE]");
		var num= sc.nextInt();
		while(num != 0) {
			System.out.printf("N�mero digitado: %d%n", num);
			num = sc.nextInt();
		}
		
		System.out.println("O valor � 0. Fim do la�o while.");
		
		//For � uma estrutura de controle que remete um 	
		//bloco de comandos para um certo intervalo de 	
		//valores.
		//Usa-se quando se sabe previamente a quantidade de 
		//repeti��es, ou o intervalo de valores.
		
		System.out.println("[LA�O FOR]");
		
		num = sc.nextInt();
		for(var i = 0; i < num; i++) {
			System.out.printf("Imprimindo %d de %d%n", i, num);
		}
		
		//Do-while � menos utilizada, mas, �s vezes, se encaixa melhor
		//ao problema. O bloco de comandos � executado ao menos uma vez
		//pois a condi��o � verificada ao final.
		
		//Farenheit = 9C/5 + 32
		
		System.out.println("[DO-WHILE]");
		
		char continuar;
		
		do {
			System.out.println("Digite uma temperatura:");
			var celsius = sc.nextDouble();
			var farenheit = (9.0*celsius)/5.0 + 32.0;
			System.out.printf("%.4f�C equivalem � %.4fF.%n", celsius, farenheit);
			System.out.println("Deseja continuar? S/N");
			continuar = sc.next().charAt(0);
		}while(continuar == 's' || continuar == 'S');
		System.out.println("");
		System.out.println("Fim da execu��o.");
		
		sc.close();
	}

}
