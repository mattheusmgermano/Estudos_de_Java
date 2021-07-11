import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

//		Métodos abstratos são métodos que não possuem implementação.
//		Eles precisam ser abstratos quando a classe é genérica demais
//		para conter sua implementação.
//		
//		Se essa classe possuir pelo menos um método abstrato, essa classe
//		também é abstrata.
		Locale.setDefault(Locale.US);
		var sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the nuber of shapes: ");
		var n = sc.nextInt();

		for (var i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or circle (r/c)?");
			var ch = sc.next().charAt(0);
			System.out.print("Which color: black, green or red (BLACK/GREEN/RED)?");
			var color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Inform the width: ");
				var width = sc.nextDouble();
				System.out.print("Now inform the height: ");
				var height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Inform the radius: ");
				var radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		System.out.println("");
		System.out.println("Shape Areas: ");
		for (var shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		sc.close();

	}

}
