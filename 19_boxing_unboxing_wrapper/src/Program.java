
public class Program {

	public static void main(String[] args) {
		
		//Boxing é o processo de encaixotamento de um objeto
		//do tipo valor para um objeto referência do tipo 
		//compatível.
		
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		//Unboxing é o processo de conversão de um objeto tipo
		//referência para um objeto tipo valor compatível.
		
		int y = (int) obj; 
		
		System.out.println(y);
		
		//Wrapper Classes
		//São classes equivalentes aos tipos primitivos.
		
		//Boxing e unboxing é natural na linguagem.
		
		//Uso comum: campos de entidades em sistemas de informação.
		//Pois tipos referência (classes) aceitam valor null e usu-
		//fruem dos recursos OO.

	}

}
