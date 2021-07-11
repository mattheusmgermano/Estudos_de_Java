import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//While é uma estrutura de controle que repete um	
		//bloco de comandos enquanto uma condição for		
		//verdadeira.
		//Usar apenas quando não se souber previamente a	
		//quantidade de repetições que será realizada.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[LAÇO WHILE]");
		var num= sc.nextInt();
		while(num != 0) {
			System.out.printf("Número digitado: %d%n", num);
			num = sc.nextInt();
		}
		
		System.out.println("O valor é 0. Fim do laço while.");
		
		//For é uma estrutura de controle que remete um 	
		//bloco de comandos para um certo intervalo de 	
		//valores.
		//Usa-se quando se sabe previamente a quantidade de 
		//repetições, ou o intervalo de valores.
		
		System.out.println("[LAÇO FOR]");
		
		num = sc.nextInt();
		for(var i = 0; i < num; i++) {
			System.out.printf("Imprimindo %d de %d%n", i, num);
		}
		
		//Do-while é menos utilizada, mas, às vezes, se encaixa melhor
		//ao problema. O bloco de comandos é executado ao menos uma vez
		//pois a condição é verificada ao final.
		
		//Farenheit = 9C/5 + 32
		
		System.out.println("[DO-WHILE]");
		
		char continuar;
		
		do {
			System.out.println("Digite uma temperatura:");
			var celsius = sc.nextDouble();
			var farenheit = (9.0*celsius)/5.0 + 32.0;
			System.out.printf("%.4fºC equivalem à %.4fF.%n", celsius, farenheit);
			System.out.println("Deseja continuar? S/N");
			continuar = sc.next().charAt(0);
		}while(continuar == 's' || continuar == 'S');
		System.out.println("");
		System.out.println("Fim da execução.");
		
		sc.close();
	}

}
