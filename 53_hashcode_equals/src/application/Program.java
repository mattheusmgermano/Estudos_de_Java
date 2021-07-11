package application;

import entities.Client;

public class Program {
	public static void main(String[] args) {
//		hashCode e Equals
//		São operações da classe Object utilizadas para comparar se um objeto
//		é igual a outro. 
//		
//		Equals: lento, resposta 100%;
//		hashCode: rápido, porém resposta positiva não é 100%;
//		
//		Tipos comuns (String, Date, Integer, Double, etc) já possuem implementação
//		para essas operações. Classes personalizadas precisam sobrepô-las.
		
//		Equals
//		
//		Método que compara se o objeto é igual ao outro, retornando true ou false.

//		var a = "Maria";
//		var b = "Alex";
//		System.out.println(a.equals(b));
		
//		HashCode
//		Método que retorna um número inteiro representando um código gerado a partir
//		das informações do objeto.
		
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
		
//		Regra de ouro do HashCode
//		Se o hashcode de dois objetos for diferente, então os dois objetos são
//		diferentes.
//		
//		Se o código de dois objetos for igual, muito provavelmente os objetos são iguais(pode haver colisão).
		
		var c1 = new Client("Genezésio Genésio General", "botinaslustradas@email.com");
		var c2 = new Client("Micaelita Esposita Cabecita Grandecita", "miquitamiquititatikalakatika@email.com.br");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		var c3 = c1;
		System.out.println(c1 == c3);
		
	}
}
