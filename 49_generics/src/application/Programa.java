package application;

import java.util.Scanner;

import services.PrintService;

public class Programa {
	public static void main (String[] args) {
		
//		Generics permitem que classes, interfaces e m�todos possam ser
//		parametrizados por tipos. Seus benef�cios s�o:
//			Reuso;
//			Type safety;
//			Performance.
//			
//		Uso comum: cole��es
		
		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
		
	}
}
