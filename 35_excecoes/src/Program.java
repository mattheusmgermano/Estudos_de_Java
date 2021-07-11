import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
//		Uma exceção é qualquer condição de erro ou comportamento inesperado
//		encontrado por um programa em execução.
//		
//		Em Java, uma exceção é um objeto herdado da classe:
//			java.lang.Exception - o compilador obriga a tratar ou propagar
//			java.lang.RuntimeException - o compilador não obriga a tratar ou propagar
//			
//		Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em
//		execução, até que seja capturada (tratada) ou o programa seja encerrado.
//		
//		Por que exceções? 
//		
//		O modelo de tratamento de exceções permite que erros sejam tratados
//		de forma consistente e flexível, usando boas práticas.
//		
//		Vantagens:
//			Delega a lógica do erro para a classe responsável por conhecer as regras
//			que podem ocasioná-lo.
//			
//			Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes
//			
//			A exceção pode carregar dados quaisquer
		
		File file = new File("C:\\Fora\\Bolsonaro\\Genocida.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
			System.out.println("Finally executed.");
		}
		
		
	}
	
	public static void method2() {
		System.out.println("Method#2 have started!");
		method1();
		System.out.println("Method#2 had successfully concluded its operation!");
	}

	public static void method1() {
		var sc = new Scanner(System.in);
		
		System.out.println("Method#1 have started!");
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid position! A position cannot be a letter, symbol or a word!");
		}

		System.out.println("Method#1 had successfully concluded its operation");
		sc.close();
	}

}
