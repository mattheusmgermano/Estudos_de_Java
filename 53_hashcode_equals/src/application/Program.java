package application;

import entities.Client;

public class Program {
	public static void main(String[] args) {
//		hashCode e Equals
//		S?o opera??es da classe Object utilizadas para comparar se um objeto
//		? igual a outro. 
//		
//		Equals: lento, resposta 100%;
//		hashCode: r?pido, por?m resposta positiva n?o ? 100%;
//		
//		Tipos comuns (String, Date, Integer, Double, etc) j? possuem implementa??o
//		para essas opera??es. Classes personalizadas precisam sobrep?-las.
		
//		Equals
//		
//		M?todo que compara se o objeto ? igual ao outro, retornando true ou false.

//		var a = "Maria";
//		var b = "Alex";
//		System.out.println(a.equals(b));
		
//		HashCode
//		M?todo que retorna um n?mero inteiro representando um c?digo gerado a partir
//		das informa??es do objeto.
		
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
		
//		Regra de ouro do HashCode
//		Se o hashcode de dois objetos for diferente, ent?o os dois objetos s?o
//		diferentes.
//		
//		Se o c?digo de dois objetos for igual, muito provavelmente os objetos s?o iguais(pode haver colis?o).
		
		var c1 = new Client("Genez?sio Gen?sio General", "botinaslustradas@email.com");
		var c2 = new Client("Micaelita Esposita Cabecita Grandecita", "miquitamiquititatikalakatika@email.com.br");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		var c3 = c1;
		System.out.println(c1 == c3);
		
	}
}
