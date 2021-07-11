package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));
		
//		Nota sobre fun��o map:
//		A fun��o "map" (n�o confundir com estrutura map) � uma fun��o que aplica
//		uma fun��o a todos elementos de uma Stream.
//		
//		Convers�es:
//			list para stream: .stream();
//			stream para list: collect(Collectors.toList())
		
//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
//		List<String> names = list.stream().map(Product::upperCaseName).collect(Collectors.toList());
//		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
//		Function<Product, String> func = p -> p.getName().toUpperCase();
//		List<String> names = list.stream().map(func).collect(Collectors.toList());
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		
		
	}
}
