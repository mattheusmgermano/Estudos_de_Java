import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
//		Lista é uma estrutura de dados:
//			Homogênea(dados do mesmo tipo);
//			Ordenada (elementos acessados por meio de posição);
//			Inicia vazia, e seus elementos são alocados sob demanda;
//			Cada elemento ocupa um nó (ou nodo) da lista.
//			
//		Tipo: (interface) List
//		Classes que implementam: ArrayList, LinkedList, etc.
//		
//		Vantagens:
//			Tamanho variável
//			Facilidade para se realizar inserções e deleções
//			
//		Desvantagens:
//			Acesso sequencial aos elementos *
//		
//		Tamanho da lista: size();
//		Inserir: add(obj), add(int, obj);
//		Remover: remove(obj), remove(int), removeIf(Predicate);
//		Encontrar uma posição de elemento: indexOf(obj), lastIndexOf(obj);
//		Filtrar: 
//			List<Integer> result = list.stream()
//			.filter(x -> x>4)
//			.collect(Collectors.toList());
//		Encontrar primeira ocorrência com base em predicado:
//			Integer result = list.stream()
//			.filter(x -> x > 4)
//			.findFirst()
//			.orElse(null);

//		var list = new ArrayList<String>();
//
//		list.add("Stalin");
//		list.add("Lenin");
//		list.add("Mao Zedong");
//		list.add("Trotsky");
//
//		lerListaRevolucao(list);
//
//		list.add("Karl Marx");
//
//		lerListaRevolucao(list);
		
		var commonList = new ArrayList<String>();
		commonList.add("Maria");
		commonList.add("Adam Sandler");
		commonList.add("Mike Wazowsky");
		commonList.add("Jim Sturgess");
		commonList.add("Sophia Copola");
		commonList.add("Deuzemar Deuzenice");
		commonList.add("Ilarilarie Ohohoh");
		commonList.add("Xuxa Meneghel");
		
		ler(commonList);
		
		commonList.remove(0);
		
		ler(commonList);
		
		commonList.removeIf(x -> x.charAt(0) =='M');
		
		ler(commonList);
		
		System.out.println("Index of Deuzemar Deuzenice: " + commonList.
				indexOf("Deuzemar Deuzenice"));
		
		var mirrorList = commonList.stream()
				.filter(x -> x.charAt(0) == 'A')
				.collect(Collectors.toList());
		
		ler(mirrorList);

	}

	private static void ler(List<String> commonList) {
		System.out.println("");
		for(var item : commonList) {
			System.out.printf("%s Pos:[%d]%n", item, commonList.indexOf(item));
		}
		System.out.println("");
	}

	private static void lerListaRevolucao(ArrayList<String> list) {
		var contraRevolucionarioEncontrado = "";
		System.out.println("---------------");
		for (var item : list) {
			if (item.equals("Trotsky")) {
				System.out.println("Não há espaço para contra-revolucionários.");
				contraRevolucionarioEncontrado = item;
			} else {
				System.out.println(item);
			}
		}
		if(contraRevolucionarioEncontrado != "") {
			list.remove(contraRevolucionarioEncontrado);
		}
		System.out.println("---------------");
	}

}