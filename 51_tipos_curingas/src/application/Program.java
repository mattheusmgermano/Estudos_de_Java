package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main (String[] args) {
//		Generics s?o invariantes
//		List<Object> n?o ? o supertipo de qualquer tipo de lista:
//		List<Object> myObjs = new ArrayList<Object>();
//		List<Integer> myNumbers = new ArrayList<Integer>();
//		MyObjs = myNumbers; -> erro de compila??o

//		O supertipo de qualquer lista ? List<?>. Este ? um tipo coringa:
			
//		List<?> myObjs = new ArrayList<Object>();
//		List<Integer> myNumbers = new ArrayList<Integer>();
//		myObjs = myNumbers;
		
//		Com tipos coringa podemos fazer m?todos que recebem um gen?rico
//		de "qualquer tipo":
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		extracted(myInts);
		
	}

	public static void extracted(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	
//	No entanto, em listas coringas elementos n?o podem ser adicionados.
}
