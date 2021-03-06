package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
	public double filteredSum(List<Product> list) {
		double sum = 0.0;
		for(var p : list) {
			if(p.getName().charAt(0) == 'C') {
				sum += p.getPrice();
			}
		}
		return sum;
	}
	public double filteredSumWithPredicate(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for(var p : list) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
