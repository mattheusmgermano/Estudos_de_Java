package services;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("This list can't be empty, you prick");
		}
		
		T max = list.get(0);
		for (var item : list) {
			if(item.compareTo(max) > 0) { // compara se o item é maior que 0, se sim = 1, se não = 0
				max = item;
			}
		}
		return max;
	}
}
