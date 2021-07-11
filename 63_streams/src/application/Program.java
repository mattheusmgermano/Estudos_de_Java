package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) {
//		É uma sequência de elementos advinda de uma fonte de dados que oferece a
//		"operações agregadas".
//		Fonte de dados: coleção, array, função de iteração, recurso de E/S;
		
//		Características
//		
//		Stream é uma solução para processar sequências de dados de forma:
//			Declarativa(iteração interna: escondida do programador)
//			Parallel-friendly (imutável->thread safe)
//			Sem efeitos colaterais
//			Sob demanda (lazy evaluation)
//		
//		Acesso sequencial
//		
//		Single-use: só pode ser usada uma vez
//		
//		Pipeline: operações em streams retornam novas streams. Então é possível
//		criar uma cadeia de operações (fluxo de processamento).
		
//		Operações intermediárias e terminais
//		
//		O pipeline é composto por zero ou mais operações intermediárias e uma terminal.
//		
//		Operação intermediária:
//			Produz uma nova stream(encadeamento)
//			Só executa quando uma operação terminal é invocada (lazy evaluation)
//			
//		Operação terminal:
//			Produz um objeto não-stream(coleção ou outro)
//			Determina o fim do processamento da stream
		
//		Operações intermediárias:
//			filter
//			map
//			flatmap
//			peek
//			distinct
//			sorted
//			skip
//			limit(num) -> short-circuit -> termina o processamento da stream de acordo com o número informado
		
//		Operações terminais:
//			forEach
//			forEachOrdered
//			toArray
//			reduce
//			collect
//			min
//			max
//			count
//			anyMatch(*)
//			allMatch(*)
//			noneMatch(*)
//			findFirst(*)
//			findAny(*)
//			* -> short-circuit
		
//		Como criar um stream?
//				
//		Basta chamar o método stream() ou parallelStream() a partir de qualquer objeto Collection. 
//		
//		Outras formas de se criar uma stream incluem:
//			Stream.of()
//			Stream.ofNullable()
//			Stream.iterate()

		
		List<Integer> list = Arrays.asList(1, 3, 5, 6, 123454, 124,7586, 3463, 4554, 657457, 34634, 23, 23523, 235, 996);
		Stream<Integer> strim = list.stream().map(p -> p * 12345);
		System.out.println(Arrays.toString(strim.toArray()));
		
		int sum = list.stream().reduce(0, (x,y) -> x + y);
		System.out.println("sum = " + sum);
		
		List<Integer> newList = list.stream()
				.filter(p -> p % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(newList.toArray()));
		
		
	}

	public static void deregunde() {
		List<Integer> list = Arrays.asList(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(20).toArray()));
		
		Stream<Long> fibonacci = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(fibonacci.limit(20).toArray()));
	}
}
 