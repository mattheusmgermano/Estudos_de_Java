package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.ProductService;

public class Program {
	public static void main(String[] args) {
//		Recordando:
//			removeIf(Predicate)
//			foreach(Consumer)
//			map(Function)
//			
//		Mas e se, eu, Mattheus Germano quiser criar a minha fun??o que recebe outra fun??o como argumento?
//				
//		A resposta ?: n?o sei.
//		
//		Mentira.
		
//		Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos pre?os
//		somente dos produtos cujo nome come?a com "T".
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Ultimate Gar?om Seguran?a Bi?nico com Jatos de Propuls?o Ultras?nica e Armas Laser", 999999.00));
		list.add(new Product("Botas A?reas para 75% de Flutua??o Corp?rea", 85000.00));
		list.add(new Product("Nave R?plica da Mulher Maravilha, 100% Invis?vel (Meu deus cad??)", 1000000.00));
		list.add(new Product("Super Sabre Laser Recarreg?vel a Base de Energia E?lica", 60000.00));
		list.add(new Product("Cloroquina Radiotiva para Evolu??o em Carangueijo", 900.00));
		list.add(new Product("Cloroquina Premium, Safra de Chernobyl, para Evolu??o em Minhoca Met?lica", 900.00));
		
		var ps = new ProductService();
		
		double sum = ps.filteredSum(list);
		double sum2 = ps.filteredSumWithPredicate(list, p -> p.getName().charAt(0) == 'C');
		
		System.out.println("Sum: "+ String.format("%.2f", sum));
		System.out.println("Sum: "+ String.format("%.2f", sum2));
		
		
		
	}
}
