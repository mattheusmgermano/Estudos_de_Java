import java.util.Locale;
import java.util.Scanner;

import utilities.Calculator;
import utilities.Circle;

public class Program {

	public static void main(String[] args) {
//		 Fazer um programa para ler um valor numérico qualquer, e daí mostrar
//		 quanto seria o valor de uma circunferência e do volume de uma esfera 
//		 para um raio daquele valor. Informar também o valor do PI, com duas
//		 casas decimais.
		Locale.setDefault(Locale.US);
		var sc = new Scanner(System.in);
		
		System.out.println("Informe o raio e a altura, respectivamente, do cilindro:");
		var circle = new Circle(sc.nextDouble(), sc.nextDouble());
		
		System.out.println(Calculator.Circunference(circle.radius));
		System.out.println(Calculator.Volume(circle.radius, circle.height));
		System.out.println("Pi:" + Math.PI);
		sc.close();
	}

}
