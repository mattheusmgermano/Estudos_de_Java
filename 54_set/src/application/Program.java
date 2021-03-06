package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {
//	Set<T>
//	Representa um conjunto de elementos (similar ao da ?lgebra)
//	N?o admite repeti??es
//	Elementos n?o possuem posi??o
//	Acesso, inser??o e remo??o s?o r?pidos
//	Oferece opera??es eficientes de conjunto: interse??o, uni?o, diferen?a
//	Principais implementa??es:
//		HashSet - mais r?pido (opera??esO(1) em tabelas hash) e n?o ordenado;
//		TreeSet - mais lento (opera??es O(log(n)) em ?rvore rubro-negra) pelo
//		compareTo do objeto (ou Comparator)
//		LinkedHashSet - velocidade intermedi?ria e elementos na ordem em que s?o adicionados
//		
//	Alguns m?todos importantes:
//	add(obj), remove(obj), contains(obj)
//		Baseado em equals e hashCode;
//		Se equals e hashCode n?o existir, ? usada compara??o de ponteiros.
//	clear()
//	size()
//	removeIf(predicate)
//	addAll(other) - uni?o: adiciona no conjunto os elementos de outro conjunto, sem repeti??o
//	retainAll(other) - interse??o: remove do conjunto os elementos n?o contidos em other
//	removeAll(other) - diferen?a: remove do conjunto os elementos contidos em other

	public static void main(String[] args) {
//		hashset();
//		treeset();
//		linkedset();

		unionIntersectionDifference();

//		Como as cole??es Hash testam igualdade?
//		
//		Se HashCode e equals estiverem implementados:
//			Primeiro HashCode. Se der igual, usa equals para confirmar.
//			
//			String, Integer, Double, etc. j? possuem equals e HashCode.
//			
//		Se HashCode e equals n?o estiverem implementados:
//			Compara a refer?ncia(ponteiros) dos objetos.
//		
		setComparer();
		
//		Como TreeSet compara valores?

		Set<Product> set = new TreeSet<>();
		set.add(new Product("TV", 599.99));
		set.add(new Product("Notebook", 999.99));
		set.add(new Product("Tablet", 199.99));

		for(var prod : set) {
			System.out.println(prod);
		}
	}

	public static void unionIntersectionDifference() {
		var a = new TreeSet<>(Arrays.asList(0, 2, 3, 6, 9, 12));
		var b = new TreeSet<>(Arrays.asList(2, 4, 8, 10, 20, 100, 77777));

		// uni?o
		var c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);

		// interse??o
		var d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);

		// diferen?a
		var e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

	public static void setComparer() {
		Set<Product> set = new HashSet<>();
		set.add(new Product("TV", 599.99));
		set.add(new Product("Notebook", 999.99));
		set.add(new Product("Tablet", 199.99));

		var prod = new Product("Notebook", 999.99);

		System.out.println(set.contains(prod));
	}

	public static void treeset() {
		Set<String> set = new TreeSet<>();
		set.add("1) TV");
		set.add("2) Videogame");
		set.add("3) Rometitxe");

		System.out.println(set.contains("3) Rometitxe"));

		for (var obj : set) {
			System.out.println(obj);
		}
		System.out.println("[Fim do m?todo TreeSet]");
	}

	public static void linkedset() {
		Set<String> set = new LinkedHashSet<>();
		set.add("1) TV");
		set.add("2) Videogame");
		set.add("3) Rometitxe");

		System.out.println(set.contains("3) Rometitxe"));

		set.removeIf(x -> x.length() >= 7);

		for (var obj : set) {
			System.out.println(obj);
		}
		System.out.println("[Fim do m?todo LinkedHashSet]");
	}

	public static void hashset() {
		Set<String> set = new HashSet<>();
		set.add("1) TV");
		set.add("2) Videogame");
		set.add("3) Rometitxe");

		System.out.println(set.contains("3) Rometitxe"));

		for (var obj : set) {
			System.out.println(obj);
		}
		System.out.println("[Fim do m?todo HashSet]");
	}

}
