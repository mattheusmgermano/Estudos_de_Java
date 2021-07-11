
public class Main {

	public static void main(String[] args) {
//		Fazer um programa para ler os produtos dados de um produto em estoque (nome, preço e quantidade no estoque)
//		Em seguida: 
//			Mostrar os dados do produto(nome, preço, quantidade, valor total no estoque)
//			Realizar uma entrada no estoque e mostrar novamente os dados do produto
//			Realizar uma saída no estoque e mostrar novamente os dados doo produto

		var facaDePao = new Product("Faca de Pão", 35.00, 199);
		facaDePao.TotalValueInStock();
		facaDePao.AddProduct(30000);
		facaDePao.RemoveProduct(12345);
	}

}
