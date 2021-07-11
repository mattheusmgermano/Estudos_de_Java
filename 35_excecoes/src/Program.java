import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
//		Uma exce��o � qualquer condi��o de erro ou comportamento inesperado
//		encontrado por um programa em execu��o.
//		
//		Em Java, uma exce��o � um objeto herdado da classe:
//			java.lang.Exception - o compilador obriga a tratar ou propagar
//			java.lang.RuntimeException - o compilador n�o obriga a tratar ou propagar
//			
//		Quando lan�ada, uma exce��o � propagada na pilha de chamadas de m�todos em
//		execu��o, at� que seja capturada (tratada) ou o programa seja encerrado.
//		
//		Por que exce��es? 
//		
//		O modelo de tratamento de exce��es permite que erros sejam tratados
//		de forma consistente e flex�vel, usando boas pr�ticas.
//		
//		Vantagens:
//			Delega a l�gica do erro para a classe respons�vel por conhecer as regras
//			que podem ocasion�-lo.
//			
//			Trata de forma organizada (inclusive hier�rquica) exce��es de tipos diferentes
//			
//			A exce��o pode carregar dados quaisquer
		
		File file = new File("C:\\Fora\\Bolsonaro\\Genocida.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Arquivo n�o encontrado: " + e.getMessage());
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
