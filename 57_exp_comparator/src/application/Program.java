package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {
	
//	Problema:
//		
//	Suponha uma classe Product com os atributos name e price.
//	
//	Podemos implementar a compara??o de produtos por meio da
//	implementa??o da interface Comparable<Product>.
//	
//	Entretanto, desta forma nossa classe n?o fica fechada para
//	altera??o: se o crit?rio de compara??o mudar, precisaremos 
//	alterar a classe product.
//	
//	Podemos usar ent?o o default method "sort" da interface List: 
//		default void sort(Comparator<? super E> c);
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 399.99));
		list.add(new Product("Gamer Notebook", 3999.99));
		list.add(new Product("iPad", 999.99));
		
//		Collections.sort(list);  // tem que ser comparable para usar collections.sort
		
//		list.sort(new MyComparator());
		
//		comparatorCClasseAnonima();
		
//		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (var item : list) {
			System.out.println(item.toString());
		}
	}

public static void comparatorCClasseAnonima() {
	Comparator<Product> comp = new Comparator<Product>() {

		@Override
		public int compare(Product p1, Product p2) {
			// TODO Auto-generated method stub
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		}
	};
}
}