
public class Program {

	public static void main(String[] args) {
		
		//Boxing � o processo de encaixotamento de um objeto
		//do tipo valor para um objeto refer�ncia do tipo 
		//compat�vel.
		
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		//Unboxing � o processo de convers�o de um objeto tipo
		//refer�ncia para um objeto tipo valor compat�vel.
		
		int y = (int) obj; 
		
		System.out.println(y);
		
		//Wrapper Classes
		//S�o classes equivalentes aos tipos primitivos.
		
		//Boxing e unboxing � natural na linguagem.
		
		//Uso comum: campos de entidades em sistemas de informa��o.
		//Pois tipos refer�ncia (classes) aceitam valor null e usu-
		//fruem dos recursos OO.

	}

}
