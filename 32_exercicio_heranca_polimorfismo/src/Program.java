import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {

//		Uma empresa possui funcion�rios pr�prios e terceirizados.
//		Para cada funcion�rio, deseja-se registrar nome, horas 
//		trabalhadas e valor por hora. Funcion�rios terceirizado 
//		possuem ainda uma despesa adicional.
//		
//		O pagamento dos funcion�rios corresponde ao valor da hora
//		multiplicado pelas horas trabalhadas, sendo que  os funcio
//		n�rios terceirizados ainda recebem um b�nus correspondente
//		a 110% de sua despesa adicional.
//		
//		Fazer um programa para ler os dados de N funcion�rios (N
//		fornecido pelo usu�rio) e armazen�-los em uma lista. Depo
//		is de ler todos os dados, mostrar nome e pagamento de cada
//		funcion�rio na mesma ordem em que foram digitados.
//		
//		Construa o programa conforme projeto ao lado.

		var sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		var n = sc.nextInt();
		for (var i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			var name = sc.nextLine();
			System.out.println("Hours: ");
			var hours = sc.nextInt();
			System.out.print("Value per hour: ");
			var valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.println("Additional charge: ");
				var additionalCharge = sc.nextDouble();
				var emp = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			} else {
				var emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}

		}
		
		System.out.println("Payments: ");
		for (var emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}

		sc.close();

	}

}
