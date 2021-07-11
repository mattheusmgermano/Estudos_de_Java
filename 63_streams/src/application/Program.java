package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) {
//		� uma sequ�ncia de elementos advinda de uma fonte de dados que oferece a
//		"opera��es agregadas".
//		Fonte de dados: cole��o, array, fun��o de itera��o, recurso de E/S;
		
//		Caracter�sticas
//		
//		Stream � uma solu��o para processar sequ�ncias de dados de forma:
//			Declarativa(itera��o interna: escondida do programador)
//			Parallel-friendly (imut�vel->thread safe)
//			Sem efeitos colaterais
//			Sob demanda (lazy evaluation)
//		
//		Acesso sequencial
//		
//		Single-use: s� pode ser usada uma vez
//		
//		Pipeline: opera��es em streams retornam novas streams. Ent�o � poss�vel
//		criar uma cadeia de opera��es (fluxo de processamento).
		
//		Opera��es intermedi�rias e terminais
//		
//		O pipeline � composto por zero ou mais opera��es intermedi�rias e uma terminal.
//		
//		Opera��o intermedi�ria:
//			Produz uma nova stream(encadeamento)
//			S� executa quando uma opera��o terminal � invocada (lazy evaluation)
//			
//		Opera��o terminal:
//			Produz um objeto n�o-stream(cole��o ou outro)
//			Determina o fim do processamento da stream
		
//		Opera��es intermedi�rias:
//			filter
//			map
//			flatmap
//			peek
//			distinct
//			sorted
//			skip
//			limit(num) -> short-circuit -> termina o processamento da stream de acordo com o n�mero informado
		
//		Opera��es terminais:
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
//		Basta chamar o m�todo stream() ou parallelStream() a partir de qualquer objeto Collection. 
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
 