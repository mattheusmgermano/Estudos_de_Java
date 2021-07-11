import entities.Product;

public class Program {

	public static void main(String[] args) {
//		Encapsulamento � um princ�pio que consiste em esconder detalhes de implementa��o
//		de uma classe, expondo apenas opera��es seguras e que mantenham os objetos em um
//		estado consistente.
//		
//		Regra de ouro: o objeto deve sempre estar em um estado consistente, e a pr�pria
//		classe deve garantir isso.
//		
//		Regra geral b�sica: um objeto N�O deve expor nenhum atributo(modificador de acesso
//		private)
//		
//		Os atributos devem ser acessados por meio de m�todos get e set.
		
		var produto = new Product("Chinelo de Bail�o", 35.00, 100);
		
		System.out.println(produto.getName());
		
		produto.setName("Chinelo de Bail�o Peluciado");
		
		System.out.println(produto.getName());

	}

}
