package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {
	
	public static void main (String[] args) {
//		Fazer um programa que, a partir de uma lista de produtos, 
//		remova somente aqueles cujo preço mínimo seja 100.
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));
		
//		list.removeIf(p -> p.getPrice() >= 100.00); //  expressão lambda inline
//		list.removeIf(new ProductPredicate());
//		list.removeIf(Product::staticProductPredicate);
		Predicate<Product> pred = p -> p.getPrice() >= 100; // expressão lambda declarada
		
		
		for(var item: list) {
			System.out.println(item);
		}
		
		
	}
}
