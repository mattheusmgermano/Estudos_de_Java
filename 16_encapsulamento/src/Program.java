import entities.Product;

public class Program {

	public static void main(String[] args) {
//		Encapsulamento é um princípio que consiste em esconder detalhes de implementação
//		de uma classe, expondo apenas operações seguras e que mantenham os objetos em um
//		estado consistente.
//		
//		Regra de ouro: o objeto deve sempre estar em um estado consistente, e a própria
//		classe deve garantir isso.
//		
//		Regra geral básica: um objeto NÃO deve expor nenhum atributo(modificador de acesso
//		private)
//		
//		Os atributos devem ser acessados por meio de métodos get e set.
		
		var produto = new Product("Chinelo de Bailão", 35.00, 100);
		
		System.out.println(produto.getName());
		
		produto.setName("Chinelo de Bailão Peluciado");
		
		System.out.println(produto.getName());

	}

}
