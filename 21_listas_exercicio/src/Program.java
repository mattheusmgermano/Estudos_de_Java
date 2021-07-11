import java.util.ArrayList;
import java.util.Scanner;

import entities.Employees;

public class Program {
	public static void main (String[] args) {
//		Fazer um programa para ler um número inteiro N e depois
//		os dados(id, nome, salario) de N funcionarios. Não pode
//		haver repetição de ID.
//		
//		Em seguida, efetuar o aumento de X por cento no salário
//		de um determinado funcionário. Para isso o programa de-
//		ve ler um id e um valor X. Ao final, mostrar a listagem
//		dos funcionários.
		
		
		var employeesList = new ArrayList<Employees>();
		employeesList.add(new Employees(333, "Maria Brown", 4000.00));
		employeesList.add(new Employees(536, "Alex Grey", 3000.00));
		employeesList.add(new Employees(772, "Bob Green", 5000.00));
		
		readList(employeesList);
		
		raiseSalary(employeesList);
		
		readList(employeesList);
		
		
	}

	private static void readList(ArrayList<Employees> employeesList) {
		for(var employee : employeesList) {
			System.out.println(employee.toString());
		}
	}

	private static void raiseSalary(ArrayList<Employees> list) {
		var sc = new Scanner(System.in);
		
		System.out.println("Now enter how much of his/her salary you want to increase(in percentage):");
		var percent = sc.nextDouble();
		
		System.out.println("Enter the employee's ID: ");
		var id = sc.nextInt();
		
		Employees emp = list.stream()
				.filter(x -> x.id == id)
				.findFirst()
				.orElse(null);
		if(emp == null) {
			System.out.println("Employee not found!");
		}else {
			emp.setWage((emp.getWage() *(1.0 + percent)));
		}
		sc.close();
	}

}
