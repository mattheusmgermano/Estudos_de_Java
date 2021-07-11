import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
//		Lista � uma estrutura de dados:
//			Homog�nea(dados do mesmo tipo);
//			Ordenada (elementos acessados por meio de posi��o);
//			Inicia vazia, e seus elementos s�o alocados sob demanda;
//			Cada elemento ocupa um n� (ou nodo) da lista.
//			
//		Tipo: (interface) List
//		Classes que implementam: ArrayList, LinkedList, etc.
//		
//		Vantagens:
//			Tamanho vari�vel
//			Facilidade para se realizar inser��es e dele��es
//			
//		Desvantagens:
//			Acesso sequencial aos elementos *
//		
//		Tamanho da lista: size();
//		Inserir: add(obj), add(int, obj);
//		Remover: remove(obj), remove(int), removeIf(Predicate);
//		Encontrar uma posi��o de elemento: indexOf(obj), lastIndexOf(obj);
//		Filtrar: 
//			List<Integer> result = list.stream()
//			.filter(x -> x>4)
//			.collect(Collectors.toList());
//		Encontrar primeira ocorr�ncia com base em predicado:
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
				System.out.println("N�o h� espa�o para contra-revolucion�rios.");
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